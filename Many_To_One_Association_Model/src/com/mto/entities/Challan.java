package com.mto.entities;

import java.io.Serializable;
import java.util.Date;

public class Challan implements Serializable 
{
	protected int challanNo;
	protected String violationType;
	protected Date challanDate;
	protected String description;
	protected double amount;
	protected Vehicle vehicle;
	
	public int getChallanNo() {
		return challanNo;
	}
	public void setChallanNo(int challanNo) {
		this.challanNo = challanNo;
	}
	public String getViolationType() {
		return violationType;
	}
	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}
	public Date getChallanDate() {
		return challanDate;
	}
	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
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
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Challan [challanNo=" + challanNo + ", violationType=" + violationType + ", challanDate=" + challanDate
				+ ", description=" + description + ", amount=" + amount + ", vehicle=" + vehicle + "]";
	}
	
	
	
}
