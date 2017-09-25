package pojo;

import java.sql.Date;

public class Role {
	
	/**
	 * ��ɫ���
	 */
	private Integer id;
	
	/**
	 * ��ɫ����
	 */
	private String roleCode;
	
	/**
	 * ��ɫ����
	 */
	private String roleName;
	
	/**
	 * ������
	 */
	private Integer createdBy;
	
	/**
	 * ����ʱ��
	 */
	private Date creationDate;
	
	/**
	 * �޸���
	 */
	private Integer modifyBy;
	
	/**
	 * �޸�ʱ��
	 */
	private Date modifyDate;

	public Integer getId() {
		return id;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public String getRoleName() {
		return roleName;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
}
