package pojo;

import java.sql.Date;

public class Bill {
	
	private Integer id;
	
	private String billCode;
	
	private String productName;
	
	private String productDesc;
	
	private String productUnit;
	
	private double productCount;
	
	private double totalPrice;
	
	private Integer isPayment;
	
	private Integer createdBy;
	
	private Date creationDate;
	
	private Integer modifyBy;
	
	private Date modifyDate;
	
	private Integer providerId;
	
	//扩展字段
	/**
	 * 供应商名称
	 */
	private String proName;
	
	//扩展方法
	public String getProName() {
		return proName;
	}
	
	public void setProName(String proName) {
		this.proName = proName;
	}
	//**************************************************
	
	public Integer getId() {
		return id;
	}

	public String getBillCode() {
		return billCode;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public double getProductCount() {
		return productCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public Integer getIsPayment() {
		return isPayment;
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

	public Integer getProviderId() {
		return providerId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public void setProductCount(double productCount) {
		this.productCount = productCount;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setIsPayment(Integer isPayment) {
		this.isPayment = isPayment;
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

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	} 
}
