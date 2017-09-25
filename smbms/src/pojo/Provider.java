package pojo;

import java.sql.Date;

public class Provider {
	
	/**
	 * ��Ӧ�̱��
	 */
	private Integer id;
	
	/**
	 * ��Ӧ�̱���
	 */
	private String proCode;
	
	/**
	 * ��Ӧ������
	 */
	private String proName;
	
	/**
	 * ��Ӧ����ϸ����
	 */
	private String proDesc;
	
	/**
	 * ��Ӧ����ϵ��
	 */
	private String proContact;
	
	/**
	 * ��ϵ�绰
	 */
	private String proPhone;
	
	/**
	 * ��ַ
	 */
	private String proAddress;
	
	/**
	 * ����
	 */
	private String proFax;
	
	/**
	 * ������
	 */
	private Integer createdBy;
	
	/**
	 * ����ʱ��
	 */
	private Date creationDate;
	
	/**
	 * ����ʱ��
	 */
	private Date modifyDate;
	
	/**
	 * ������
	 */
	private Integer modifyBy;
	
	/**
	 * ��ҵӪҵִ��·��
	 */
	private String companyLicPicPath;
	
	/**
	 * ��֯��������֤
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
