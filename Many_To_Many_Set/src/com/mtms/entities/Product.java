package com.mtms.entities;

import java.io.Serializable;

public class Product implements Serializable
{
	protected int productNo;
	protected String productName;
	protected String description;
	protected String manufacturerName;
	protected String warrentyYears;
	protected double amount;
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getWarrentyYears() {
		return warrentyYears;
	}
		public void setWarrentyYears(String warrentyYears) {
		this.warrentyYears = warrentyYears;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", manufacturerName=" + manufacturerName + ", warrentYears=" + warrentyYears + ", amount=" + amount
				+ "]";
	}
	
			
	
}
