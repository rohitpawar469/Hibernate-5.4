package com.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bill_Auto")
public class Bill implements Serializable 
{
	@Id
	@Column(name="bill_No")
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	protected int billNo;
	
	@Column(name="biller_Name")
	protected String billerName;
	
	@Column(name="customer_Name")
	protected String customerName;
	
	@Column(name="bill_Date")
	protected Date billDate;
	
	@Column(name="bill_Amount")
	protected double billAmount;
	
	
	public final int getBillNo() {
		return billNo;
	}
	public final void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public final String getBillerName() {
		return billerName;
	}
	public final void setBillerName(String billerName) {
		this.billerName = billerName;
	}
	public final String getCustomerName() {
		return customerName;
	}
	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public final Date getBillDate() {
		return billDate;
	}
	public final void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public final double getBillAmount() {
		return billAmount;
	}
	public final void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", billerName=" + billerName + ", customerName=" + customerName
				+ ", billDate=" + billDate + ", billAmount=" + billAmount + "]";
	}
	
	
	
	
	
}
