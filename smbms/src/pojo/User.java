package pojo;

import java.sql.Date;

/**
 * 用户类
 * @author 轩少
 *
 */
public class User {
	/**
	 * 用户编号
	 */
	private Integer id;
	
	/**
	 * 用户编码
	 */
	private String userCode;
	
	/**
	 * 用户名称
	 */
	private String userName;
	
	/**
	 * 用户密码
	 */
	private String userPassword;
	
	/**
	 * 用户性别(1 == 男 && 2 == 女)
	 */
	private Integer gender;
	
	/**
	 * 出生日期
	 */
	private Date birthday;
	
	/**
	 * 手机号
	 */
	private String phone;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 用户角色
	 */
	private int userRole;
	
	/**
	 * 创建者
	 */
	private Integer createdBy;
	
	/**
	 * 创建时间
	 */
	private Date creationDate;
	
	/**
	 * 更新者
	 */
	private Integer modifyBy;
	
	/**
	 * 更新时间
	 */
	private Date modifyDate;
	
	/**
	 * 身份证照
	 */
	private String idPicPath;
	
	/**
	 * 组织架构代码证
	 */
	private String workPicPath;
	
	//扩展字段
	/**
	 * 角色名称
	 */
	private String roleName;	
	
	public User(){}
	/**
	 * 
	 * @param id
	 * @param userCode
	 * @param userName
	 * @param userPassword
	 * @param gender
	 * @param birthday
	 * @param phone
	 * @param address
	 * @param userRole
	 * @param createdBy
	 * @param creationDate
	 * @param modifyBy
	 * @param modifyDate
	 * @param roleName (扩展参数)
	 */
	public User(Integer id, String userCode, String userName, String userPassword, Integer gender, Date birthday, String phone, String address, Integer userRole, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate, String roleName){
		this.id = id;
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.userRole = userRole;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}

	//扩展方法
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	//****************************************
	
	
	
	public Integer getId() {
		return id;
	}

	public String getUserCode() {
		return userCode;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public Integer getGender() {
		return gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public int getUserRole() {
		return userRole;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Integer getModifyBy() {
		return modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}
	
	public String getIdPicPath() {
		return idPicPath;
	}
	
	public String getWorkPicPath() {
		return workPicPath;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	public void setIdPicPath(String idPicPath) {
		this.idPicPath = idPicPath;
	}
	
	public void setWorkPicPath(String workPicPath) {
		this.workPicPath = workPicPath;
	}
}
