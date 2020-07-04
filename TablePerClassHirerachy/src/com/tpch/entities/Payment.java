package com.tpch.entities;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable 
{
	protected int paymentNo;
	protected Date paymentDate;
	protected String description;
	protected double amount;
	
	
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", paymentDate=" + paymentDate + ", description=" + description
				+ ", amount=" + amount + "]";
	}
	
	
	
}
