package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

public class DeliveryNote implements Serializable
{

	protected int awbNo;
	protected Date deliveryDate;
	protected String deliveredBy;
	protected String deliveredTo;
	protected String mobileNo;
	protected String comments;
	protected Parcel parcel;
	
	
	public int getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(int awbNo) {
		this.awbNo = awbNo;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveredBy() {
		return deliveredBy;
	}
	public void setDeliveredBy(String deliveredBy) {
		this.deliveredBy = deliveredBy;
	}
	public String getDeliveredTo() {
		return deliveredTo;
	}
	public void setDeliveredTo(String deliveredTo) {
		this.deliveredTo = deliveredTo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Parcel getParcel() {
		return parcel;
	}
	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}
	@Override
	public String toString() {
		return "DeliveryNote [awbNo=" + awbNo + ", deliveryDate=" + deliveryDate + ", deliveredBy=" + deliveredBy
				+ ", deliveredTo=" + deliveredTo + ", mobileNo=" + mobileNo + ", comments=" + comments + ", parcel="
				+ parcel + "]";
	}
	
	
		
	
}
