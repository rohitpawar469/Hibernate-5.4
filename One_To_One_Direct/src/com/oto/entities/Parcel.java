package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

public class Parcel implements Serializable
{
	protected int awbNo;
	protected Date shippedDate;
	protected String description;
	protected String source;
	protected String destination;
	protected String senderName;
	protected String receiverName;
	protected double amount;
	
	
	public int getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(int awbNo) {
		this.awbNo = awbNo;
	}
	public Date getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Parcel [awbNo=" + awbNo + ", shippedDate=" + shippedDate + ", description=" + description + ", source="
				+ source + ", destination=" + destination + ", senderName=" + senderName + ", receiverName="
				+ receiverName + ", amount=" + amount + "]";
	}
	
		
	
	
	
}
