package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;

import service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService)ac.getBean("userService");
		List<User> allUser = us.queryAllUser(0, 3);
		for (int i = 0; i < allUser.size(); i++) {
			System.out.println(allUser.get(i).getUserName());
		}
	}
}
