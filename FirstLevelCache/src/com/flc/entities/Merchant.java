package com.flc.entities;

import java.io.Serializable;
import java.util.Date;

public class Merchant implements Serializable
{
	
	protected int merchantNo;
	protected String licenseNo;
	protected String merchantName;
	protected String ownerName;
	protected Date merchantRegistrationDate; 
	protected String status;
	
	
	public int getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(int merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Date getMerchantRegistrationDate() {
		return merchantRegistrationDate;
	}
	public void setMerchantRegistrationDate(Date merchantRegistrationDate) {
		this.merchantRegistrationDate = merchantRegistrationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Merchant [merchantNo=" + merchantNo + ", licenseNo=" + licenseNo + ", merchantName=" + merchantName
				+ ", ownerName=" + ownerName + ", merchantRegistrationDate=" + merchantRegistrationDate + ", status="
				+ status + "]";
	}
	
	
		
	
	
	
}
