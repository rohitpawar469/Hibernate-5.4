package com.tm.entities;

public class Product 
{
	protected int productNo;
	protected String productName;
	protected String description;
	protected double cost;
	protected String manufacturedDate;
	protected String warrantyYears;
	
	
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String getWarrentyYears() {
		return warrantyYears;
	}
	public void setWarrentyYears(String warrentyYears) {
		this.warrantyYears = warrentyYears;
	}
	
	
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", cost=" + cost + ", manufacturedDate=" + manufacturedDate + ", warrantyYears=" + warrantyYears
				+ "]";
	}
	
	
	
	
	
	
	
}
