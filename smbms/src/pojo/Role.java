package pojo;

import java.sql.Date;

public class Role {
	
	/**
	 * 角色编号
	 */
	private Integer id;
	
	/**
	 * 角色编码
	 */
	private String roleCode;
	
	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 创建者
	 */
	private Integer createdBy;
	
	/**
	 * 创建时间
	 */
	private Date creationDate;
	
	/**
	 * 修改者
	 */
	private Integer modifyBy;
	
	/**
	 * 修改时间
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
