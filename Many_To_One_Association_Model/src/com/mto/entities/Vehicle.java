package com.mto.entities;

import java.io.Serializable;
import java.util.Date;

public class Vehicle implements Serializable
{
	protected int vehicleNo;
	protected String registrationNo;
	protected String chassisNo;
	protected String modelNo;
	protected Date registrationDate;
	protected double price;
	
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", registrationNo=" + registrationNo + ", chassisNo=" + chassisNo
				+ ", modelNo=" + modelNo + ", registrationDate=" + registrationDate + ", price=" + price + "]";
	}
	
	
	
	
	
}
