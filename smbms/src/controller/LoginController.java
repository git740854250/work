package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

import service.UserService;

@Controller
public class LoginController {

	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@RequestMapping("/loadLogin")
	public String loadLogin(){
		return "login";
	}
	
	@RequestMapping("/openlogin")
	public String openLogin(HttpServletRequest request, HttpSession session){
		UserService us = (UserService)ac.getBean("userService");
		String state = "login";
		String userCode = request.getParameter("userCode");
		String userPassword = request.getParameter("userPassword");
		User user = us.userLogin(userCode, userPassword);
		if(user != null){
			request.getSession().setAttribute("isLogin", user.getUserName());
			session.setAttribute("userSession", user);
			state = "frame";
			session.setAttribute("user", user);
		}
		if(us.queryUserExistence(userCode) == 0){
			request.setAttribute("error", "用户不存在");
			return state;
		}else if(!us.queryUserPassWord(userCode).equals(userPassword) || us.queryUserPassWord(userCode) != userPassword){
			request.setAttribute("error", "密码错误");
		}
		return state;
	}
	
	public String cancellation(){
		return "login";
	}
}
