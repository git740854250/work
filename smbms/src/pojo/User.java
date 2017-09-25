package pojo;

import java.sql.Date;

/**
 * �û���
 * @author ����
 *
 */
public class User {
	/**
	 * �û����
	 */
	private Integer id;
	
	/**
	 * �û�����
	 */
	private String userCode;
	
	/**
	 * �û�����
	 */
	private String userName;
	
	/**
	 * �û�����
	 */
	private String userPassword;
	
	/**
	 * �û��Ա�(1 == �� && 2 == Ů)
	 */
	private Integer gender;
	
	/**
	 * ��������
	 */
	private Date birthday;
	
	/**
	 * �ֻ���
	 */
	private String phone;
	
	/**
	 * ��ַ
	 */
	private String address;
	
	/**
	 * �û���ɫ
	 */
	private int userRole;
	
	/**
	 * ������
	 */
	private Integer createdBy;
	
	/**
	 * ����ʱ��
	 */
	private Date creationDate;
	
	/**
	 * ������
	 */
	private Integer modifyBy;
	
	/**
	 * ����ʱ��
	 */
	private Date modifyDate;
	
	/**
	 * ���֤��
	 */
	private String idPicPath;
	
	/**
	 * ��֯�ܹ�����֤
	 */
	private String workPicPath;
	
	//��չ�ֶ�
	/**
	 * ��ɫ����
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
	 * @param roleName (��չ����)
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

	//��չ����
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
