package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface UserDao {
	
	/**
	 * �û���¼
	 * @return
	 */
	public User userLogin(@Param("userCode")String userCode, @Param("userPassword")String userPassword);
	
	/**
	 * ��ѯ�û�����
	 * @param userCode
	 * @return
	 */
	public int queryUserExistence(@Param("userCode")String userCode);
	
	/**
	 * ��ѯ�û�����
	 * @param userCode
	 * @return
	 */
	public String queryUserPassWord(@Param("userCode")String userCode);
	
	/**
	 * ��ѯ�û�����
	 * @return
	 */
	public int queryUserNumber();
	
	/**
	 * ��ѯ�����û�
	 * @param currentPageNo	��ǰҳ��
	 * @param pageSize	ҳ��ʾ����
	 * @return
	 */
	public List<User> queryAllUser(@Param("currentPageNo")int currentPageNo, @Param("pageSize")int pageSize);
	
	/**
	 * �����û��������û���ɫ��ѯ�û�
	 * @param userName
	 * @param userRoleId
	 * @param currentPageNo ��ǰҳ��
	 * @param pageSize ҳ��ʾ����
	 * @return
	 */
	public List<User> queryUserNameOrUserRoleIdByUser(@Param("userName")String userName, @Param("userRoleId")String userRoleId, @Param("currentPageNo")Integer currentPageNo, @Param("pageSize")Integer pageSize);
	
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
