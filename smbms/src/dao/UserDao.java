package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface UserDao {
	
	/**
	 * 用户登录
	 * @return
	 */
	public User userLogin(@Param("userCode")String userCode, @Param("userPassword")String userPassword);
	
	/**
	 * 查询用户存在
	 * @param userCode
	 * @return
	 */
	public int queryUserExistence(@Param("userCode")String userCode);
	
	/**
	 * 查询用户密码
	 * @param userCode
	 * @return
	 */
	public String queryUserPassWord(@Param("userCode")String userCode);
	
	/**
	 * 查询用户数量
	 * @return
	 */
	public int queryUserNumber();
	
	/**
	 * 查询所有用户
	 * @param currentPageNo	当前页号
	 * @param pageSize	页显示数量
	 * @return
	 */
	public List<User> queryAllUser(@Param("currentPageNo")int currentPageNo, @Param("pageSize")int pageSize);
	
	/**
	 * 根据用户姓名或用户角色查询用户
	 * @param userName
	 * @param userRoleId
	 * @param currentPageNo 当前页号
	 * @param pageSize 页显示数量
	 * @return
	 */
	public List<User> queryUserNameOrUserRoleIdByUser(@Param("userName")String userName, @Param("userRoleId")String userRoleId, @Param("currentPageNo")Integer currentPageNo, @Param("pageSize")Integer pageSize);
	
	/**
	 * 根据编号查询用户
	 * @param id
	 * @return
	 */
	public User queryIdByUser(Integer id);
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 修改用户
	 * @return
	 */
	public int updateUser(User user);
	
	/**
	 * 修改用户
	 * @param user 用户
	 * @return
	 */
	public int updateUserPassWord(User user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUser(Integer id);
}
