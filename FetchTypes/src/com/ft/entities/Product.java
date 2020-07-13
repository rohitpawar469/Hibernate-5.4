package com.ft.entities;

import java.io.Serializable;

public class Product implements Serializable {
	protected int productNo;
	protected String productName;
	protected String description;
	protected String manufacturer;
	protected double price;

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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}

}
