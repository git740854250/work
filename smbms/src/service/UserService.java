package service;

import java.util.List;

import pojo.User;

public interface UserService {
	
	/**
	 * �û���¼
	 * @return
	 */
	public User userLogin(String userCode, String userPassword);
	
	/**
	 * ��ѯ�û�����
	 * @param userCode
	 * @return
	 */
	public int queryUserExistence(String userCode);
	
	/**
	 * ��ѯ�û�����
	 * @param userCode
	 * @return
	 */
	public String queryUserPassWord(String userCode);
	
	/**
	 * ��ѯ�û�����
	 * @return
	 */
	public int queryUserNumber();
	
	/**
	 * ��ѯ�����û�
	 * @param currentPageNo ��ǰҳ��
	 * @param pageSize	ҳ��ʾ����
	 * @return
	 */
	public List<User> queryAllUser(int currentPageNo, int pageSize);
	
	/**
	 * �����û��������û���ɫ��ѯ�û�
	 * @param userName
	 * @param userRoleId
	 * @param currentPageNo ��ǰҳ��
	 * @param pageSize ҳ��ʾ����
	 * @return
	 */
	public List<User> queryUserNameOrUserRoleIdByUser(String userName, String userRoleId, Integer currentPageNo, Integer pageSize);
	
	/**
	 * ���ݱ�Ų�ѯ�û�
	 * @param id
	 * @return
	 */
	public User queryIdByUser(Integer id);
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * �޸��û�
	 * @return
	 */
	public int updateUser(User user);
	
	/**
	 * �޸��û�
	 * @param user �û�
	 * @return
	 */
	public int updateUserPassWord(User user);
	
	/**
	 * ɾ���û�
	 * @param id
	 * @return
	 */
	public int deleteUser(Integer id);
}
