package controller;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

import pojo.User;

import service.RoleService;
import service.UserService;
import util.Page;

@Controller
@RequestMapping("/user")
public class UserController {
	int pageSize = 10;
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserService us = (UserService)ac.getBean("userService");
	RoleService rs = (RoleService)ac.getBean("roleService");
	
	/**
	 * ���û������б�
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request){
		String currentPageNo = request.getParameter("currentPageNo");	//��ǰҳ
		int totalCount = us.queryUserNumber();							//������
		int totalPageCount = Page.countTotalPage(totalCount, pageSize);	//��ҳ�� 
		System.out.println(request.getSession());
		//��ʼǰ���ڿո�ֵ��һҳ
		if(currentPageNo == "" || currentPageNo == null){
			currentPageNo = "1";
		}

		request.setAttribute("currentPageNo", currentPageNo);
		request.setAttribute("totalPageCount", totalPageCount);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("roleList", rs.queryAllRole());
		request.setAttribute("userList", us.queryAllUser((Integer.valueOf(currentPageNo) - 1) * pageSize, pageSize));
		return "user/userlist";
	}
	
	/**
	 * ��ѯ�û�
	 * @param request
	 * @return
	 */
	@RequestMapping("/openList")
	public String openList(HttpServletRequest request){
		String currentPageNo = request.getParameter("currentPageNo");	//��ǰҳ
		int totalCount = us.queryUserNumber();							//������
		int totalPageCount = Page.countTotalPage(totalCount, pageSize);	//��ҳ��
		
		//��ʼǰ���ڿո�ֵ��һҳ
		if(currentPageNo == "" || currentPageNo == null){
			currentPageNo = "1";
		}
		
		String queryname = request.getParameter("queryname");
		String queryUserRole = request.getParameter("queryUserRole");
		if(queryUserRole == "-1"){
			queryUserRole = "";
		}
		
		request.setAttribute("currentPageNo", currentPageNo);
		request.setAttribute("totalPageCount", totalPageCount);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("roleList", rs.queryAllRole());
		request.setAttribute("userList", us.queryUserNameOrUserRoleIdByUser(queryname, queryUserRole, (Integer.valueOf(currentPageNo) - 1) * pageSize, pageSize));
		return "user/userlist";
	}
	
	/**
	 * �鿴�û���Ϣ
	 * @return
	 */
	@RequestMapping(value="/view/{id}",method=RequestMethod.GET)
	public String view(@PathVariable int id, HttpServletRequest request){
		request.setAttribute("user", us.queryIdByUser(Integer.valueOf(id)));
		return "user/userview";
	}
	
	/**
	 * ��������
	 * @param request
	 * @return
	 */
	@RequestMapping("/loadAdd")
	public String loadAdd(HttpServletRequest request){
		request.setAttribute("roleList", rs.queryAllRole());
		return "user/useradd";
	}
	
	/**
	 * ��ʼ����
	 * @param request
	 * @param attachs
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/openAdd")
	public String openAdd(HttpServletRequest request, @RequestParam(value="attachs", required = false) MultipartFile[] attachs) throws IOException{
		User user = new User();
		user.setUserCode(request.getParameter("userCode"));
		user.setUserName(request.getParameter("userName"));
		user.setUserPassword(request.getParameter("userPassword"));
		user.setGender(Integer.valueOf(request.getParameter("gender")));
		user.setBirthday(Date.valueOf(request.getParameter("birthday")));
		user.setPhone(request.getParameter("phone"));
		user.setAddress(request.getParameter("address"));
		user.setUserRole(Integer.valueOf(request.getParameter("userRole")));
		user.setCreatedBy(Integer.valueOf(request.getParameter("createdBy")));
		user.setModifyBy(Integer.valueOf(request.getParameter("createdBy")));
		
		String path = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploadfiles");
		//ѭ���ϴ�
		for (MultipartFile myfile : attachs) {
			FileUtils.copyInputStreamToFile(myfile.getInputStream(),new File(path, myfile.getOriginalFilename()));
		}
		
		user.setIdPicPath(attachs[0].getOriginalFilename());
		user.setWorkPicPath(attachs[1].getOriginalFilename());
		
		if(us.addUser(user) > 0){
			return list(request);
		}
		return loadAdd(request);
	}
	
	/**
	 * �����޸��û�����
	 * @return
	 */
	@RequestMapping(value="/loadModify/{id}",method=RequestMethod.GET)
	public String loadModify(HttpServletRequest request, @PathVariable int id){
		request.setAttribute("roleList", rs.queryAllRole());
		request.setAttribute("user", us.queryIdByUser(id));
		return "user/usermodify";
	}
	
	/**
	 * ��֤����
	 * @param request
	 * @return
	 */
	@RequestMapping("/verifyPassword")
	@ResponseBody
	public String verifyPassword(HttpServletRequest request){
		Map<String, String> error = new HashMap<String, String>();
		String userCode = request.getParameter("userCode");
		if(userCode == "" || userCode == null){
			error.put("result", "sessionerror");
			return JSON.toJSONString(error);
		}
		String oldpassword = request.getParameter("oldpassword");
		if(oldpassword == "" || oldpassword == null){
			error.put("result", "error");
			return JSON.toJSONString(error);
		} else if(!us.queryUserPassWord(userCode).equals(oldpassword)) {
			error.put("result", "false");
			return JSON.toJSONString(error);
		}
		error.put("result", "true");
		return JSON.toJSONString(error);
	}
	
	/**
	 * �ύ����
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/openPwdmodify")
	public String openPwdmodify(HttpServletRequest request){
		User user = new User();
		
		String userCode = request.getParameter("userCode");
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		
		if(!us.queryUserPassWord(userCode).equals(oldpassword)){
			request.setAttribute("message", "ԭ�������벻׼ȷ");
			return pwdmodify();
		}
		user.setUserCode(userCode);
		user.setUserPassword(newpassword);
		if(us.updateUserPassWord(user) > 0){
			request.setAttribute("message", "�޸ĳɹ�");
		}else{
			request.setAttribute("message", "�޸�ʧ��");
		}
		return pwdmodify();
	}
	
	/**
	 * ���޸��������
	 * @return
	 */
	@RequestMapping("/pwdmodify")	
	public String pwdmodify(){
		return "user/pwdmodify";
	}
	
	/**
	 * ɾ���û�
	 * @return 
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(HttpServletRequest request){
		Map<String, String> state = new HashMap<String, String>();
		int id = Integer.valueOf(request.getParameter("id"));
		if(us.queryIdByUser(id) == null){
			state.put("delResult", "notexist");
			return JSON.toJSONString(state);
		}else if(us.deleteUser(id) > 0){
			state.put("delResult", "true");
			return JSON.toJSONString(state);
		}
		state.put("delResult", "false");
		return JSON.toJSONString(state);
	}
}
