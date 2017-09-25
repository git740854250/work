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
	 * ��ѯ�û�����
	 */
	@Override
	public int queryUserNumber() {
		// TODO Auto-generated method stub
		return userDao.queryUserNumber();
	}
	
	/**
	 * ��ѯ�����û�
	 */
	@Override
	public List<User> queryAllUser(int currentPageNo, int pageSize) {
		// TODO Auto-generated method stub
		return userDao.queryAllUser(currentPageNo, pageSize);
	}

	/**
	 * �û���¼
	 */
	@Override
	public User userLogin(String userCode, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.userLogin(userCode, userPassword);
	}
	
	/**
	 * �����û��������û���ɫ��ѯ�û�
	 */
	@Override
	public List<User> queryUserNameOrUserRoleIdByUser(String userName,
			String userRoleId, Integer currentPageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		return userDao.queryUserNameOrUserRoleIdByUser(userName, userRoleId, currentPageNo, pageSize);
	}
	
	/**
	 * ���ݱ����ѯ�û��Ƿ����
	 */
	@Override
	public int queryUserExistence(String userCode) {
		// TODO Auto-generated method stub
		return userDao.queryUserExistence(userCode);
	}
	
	/**
	 * ���ݱ����ѯ�û�����
	 */
	@Override
	public String queryUserPassWord(String userCode) {
		// TODO Auto-generated method stub
		return userDao.queryUserPassWord(userCode);
	}

	/**
	 * ���ݱ�Ų�ѯ�û�
	 */
	@Override
	public User queryIdByUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.queryIdByUser(id);
	}
	
	/**
	 * ɾ���û�
	 */
	@Override
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}
	
	/**
	 * ����û�
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}
	
	/**
	 * �޸��û�
	 */
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	/**
	 * �޸�����
	 */
	@Override
	public int updateUserPassWord(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserPassWord(user);
	}
}
