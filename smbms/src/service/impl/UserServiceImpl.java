package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;

import pojo.User;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * 查询用户数量
	 */
	@Override
	public int queryUserNumber() {
		// TODO Auto-generated method stub
		return userDao.queryUserNumber();
	}
	
	/**
	 * 查询所有用户
	 */
	@Override
	public List<User> queryAllUser(int currentPageNo, int pageSize) {
		// TODO Auto-generated method stub
		return userDao.queryAllUser(currentPageNo, pageSize);
	}

	/**
	 * 用户登录
	 */
	@Override
	public User userLogin(String userCode, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.userLogin(userCode, userPassword);
	}
	
	/**
	 * 根据用户姓名或用户角色查询用户
	 */
	@Override
	public List<User> queryUserNameOrUserRoleIdByUser(String userName,
			String userRoleId, Integer currentPageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		return userDao.queryUserNameOrUserRoleIdByUser(userName, userRoleId, currentPageNo, pageSize);
	}
	
	/**
	 * 根据编码查询用户是否存在
	 */
	@Override
	public int queryUserExistence(String userCode) {
		// TODO Auto-generated method stub
		return userDao.queryUserExistence(userCode);
	}
	
	/**
	 * 根据编码查询用户密码
	 */
	@Override
	public String queryUserPassWord(String userCode) {
		// TODO Auto-generated method stub
		return userDao.queryUserPassWord(userCode);
	}

	/**
	 * 根据编号查询用户
	 */
	@Override
	public User queryIdByUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.queryIdByUser(id);
	}
	
	/**
	 * 删除用户
	 */
	@Override
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}
	
	/**
	 * 添加用户
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}
	
	/**
	 * 修改用户
	 */
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	/**
	 * 修改密码
	 */
	@Override
	public int updateUserPassWord(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserPassWord(user);
	}
}
