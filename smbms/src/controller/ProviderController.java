package controller;

import java.io.File;
import java.io.IOException;

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

import pojo.Provider;

import service.ProviderService;
import util.Page;

@Controller
@RequestMapping("/provider")
public class ProviderController {
	int pageSize = 10;
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	ProviderService ps = (ProviderService)ac.getBean("providerService");
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request){
		
		String currentPageNo = request.getParameter("currentPageNo");	//当前页
		int totalCount = ps.queryProviderNumber();							//总数量
		int totalPageCount = Page.countTotalPage(totalCount, pageSize);	//总页数
		
		//开始前等于空赋值第一页
		if(currentPageNo == "" || currentPageNo == null){
			currentPageNo = "1";
		}
		
		request.setAttribute("currentPageNo", currentPageNo);
		request.setAttribute("totalPageCount", totalPageCount);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("providerList", ps.queryAllProvider((Integer.valueOf(currentPageNo) - 1) * pageSize, pageSize));
		return "provider/providerlist";
	}
	
	@RequestMapping("/loadAdd")
	public String loadAdd(){
		return "provider/provideradd";
	}
	
	@RequestMapping("/openAdd")
	public String openAdd(HttpServletRequest request, @RequestParam(value="attachs", required = false) MultipartFile[] attachs) throws IOException{
		Provider provider = new Provider();
		provider.setProCode(request.getParameter("proCode"));
		provider.setProName(request.getParameter("proName"));
		provider.setProContact(request.getParameter("proContact"));
		provider.setProPhone(request.getParameter("proPhone"));
		provider.setProAddress(request.getParameter("proAddress"));
		provider.setProFax(request.getParameter("proFax"));
		provider.setProDesc(request.getParameter("proDesc"));
		provider.setCreatedBy(1);
		provider.setModifyBy(1);
		
		
		String path = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploadfiles");
		//循环上传
		for (MultipartFile myfile : attachs) {
			FileUtils.copyInputStreamToFile(myfile.getInputStream(),new File(path, myfile.getOriginalFilename()));
		}
		
		provider.setCompanyLicPicPath(attachs[0].getOriginalFilename());
		provider.setOrgCodePicPath(attachs[1].getOriginalFilename());
		
		if(ps.addProvider(provider) > 0){
			return list(request);
		}
		return loadAdd();
	}
	
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public String view(@PathVariable int id, HttpServletRequest request){
		request.setAttribute("provider", ps.queryIdByPrivider(id));
		return "provider/providerview";
	}	
	
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(HttpServletRequest request){
		return ps.deleteProvider(Integer.parseInt(request.getParameter("id")));
	}
}
