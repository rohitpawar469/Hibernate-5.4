package com.tpch.entities;

import java.util.Date;

public class DigitalPayment extends Payment 
{

	protected String digitalPaymentNo;
	protected String TxNo;
	protected Date creditedDate;
	protected String partnerName;
	protected String remarks;
	
	
	public String getDigitalPaymentNo() {
		return digitalPaymentNo;
	}
	public void setDigitalPaymentNo(String digitalPaymentNo) {
		this.digitalPaymentNo = digitalPaymentNo;
	}
	public String getTxNo() {
		return TxNo;
	}
	public void setTxNo(String txNo) {
		TxNo = txNo;
	}
	public Date getCreditedDate() {
		return creditedDate;
	}
	public void setCreditedDate(Date creditedDate) {
		this.creditedDate = creditedDate;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "DigitalPayment [digitalPaymentNo=" + digitalPaymentNo + ", TxNo=" + TxNo + ", creditedDate="
				+ creditedDate + ", partnerName=" + partnerName + ", remarks=" + remarks + ", paymentNo=" + paymentNo
				+ ", paymentDate=" + paymentDate + ", description=" + description + ", amount=" + amount
				+ ", getPaymentNo()=" + getPaymentNo() + ", getPaymentDate()=" + getPaymentDate()
				+ ", getDescription()=" + getDescription() + ", getAmount()=" + getAmount() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
