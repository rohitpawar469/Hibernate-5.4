package com.mtml.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable 
{
	protected int orderNo;
	protected String description;
	protected Date orderedDate;
	protected String customerName;
	protected double amount;
	List<Product> products;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", description=" + description + ", orderedDate=" + orderedDate
				+ ", customerName=" + customerName + ", amount=" + amount + ", products=" + products + "]";
	}
	
	
	
	
	
}
