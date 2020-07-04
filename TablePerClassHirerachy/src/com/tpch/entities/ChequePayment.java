package com.tpch.entities;

import java.io.Serializable;
import java.util.Date;

public class ChequePayment extends Payment  
{
	protected String chequeNo;
	protected Date chequeIssuedDate;
	protected String bankName;
	protected String branchName;
	protected String ifscCode;
	
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public Date getChequeIssuedDate() {
		return chequeIssuedDate;
	}
	public void setChequeIssuedDate(Date chequeIssuedDate) {
		this.chequeIssuedDate = chequeIssuedDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeIssuedDate=" + chequeIssuedDate + ", bankName="
				+ bankName + ", branchName=" + branchName + ", ifscCode=" + ifscCode + ", paymentNo=" + paymentNo
				+ ", paymentDate=" + paymentDate + ", description=" + description + ", amount=" + amount
				+ ", getPaymentNo()=" + getPaymentNo() + ", getPaymentDate()=" + getPaymentDate()
				+ ", getDescription()=" + getDescription() + ", getAmount()=" + getAmount() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
}
