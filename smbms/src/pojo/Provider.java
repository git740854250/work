package pojo;

import java.sql.Date;

public class Provider {
	
	/**
	 * 供应商编号
	 */
	private Integer id;
	
	/**
	 * 供应商编码
	 */
	private String proCode;
	
	/**
	 * 供应商名称
	 */
	private String proName;
	
	/**
	 * 供应商详细描述
	 */
	private String proDesc;
	
	/**
	 * 供应商联系人
	 */
	private String proContact;
	
	/**
	 * 联系电话
	 */
	private String proPhone;
	
	/**
	 * 地址
	 */
	private String proAddress;
	
	/**
	 * 传真
	 */
	private String proFax;
	
	/**
	 * 创建者
	 */
	private Integer createdBy;
	
	/**
	 * 创建时间
	 */
	private Date creationDate;
	
	/**
	 * 更新时间
	 */
	private Date modifyDate;
	
	/**
	 * 更新者
	 */
	private Integer modifyBy;
	
	/**
	 * 企业营业执照路径
	 */
	private String companyLicPicPath;
	
	/**
	 * 组织机构代码证
	 */
	private String orgCodePicPath;
	

	public Integer getId() {
		return id;
	}

	public String getProCode() {
		return proCode;
	}

	public String getProName() {
		return proName;
	}

	public String getProDesc() {
		return proDesc;
	}

	public String getProContact() {
		return proContact;
	}

	public String getProPhone() {
		return proPhone;
	}

	public String getProAddress() {
		return proAddress;
	}

	public String getProFax() {
		return proFax;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public Integer getModifyBy() {
		return modifyBy;
	}
	
	public String getCompanyLicPicPath() {
		return companyLicPicPath;
	}
	
	public String getOrgCodePicPath() {
		return orgCodePicPath;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	public void setProContact(String proContact) {
		this.proContact = proContact;
	}

	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}

	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}

	public void setProFax(String proFax) {
		this.proFax = proFax;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	
	public void setCompanyLicPicPath(String companyLicPicPath) {
		this.companyLicPicPath = companyLicPicPath;
	}
	
	public void setOrgCodePicPath(String orgCodePicPath) {
		this.orgCodePicPath = orgCodePicPath;
	}
}
