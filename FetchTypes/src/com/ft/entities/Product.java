package com.ft.entities;

import java.io.Serializable;

public class Product implements Serializable
{
	protected int productNo;
	protected String productName;
	protected String description;
	protected String manufacturer;
	protected double price;
	
	
	public int getProductNo() {
		return productNo;
	}
	public String getProductName() {
		return productName;
	}
	public String getDescription() {
		return description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
