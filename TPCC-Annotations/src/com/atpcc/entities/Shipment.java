package com.atpcc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "shipment")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Shipment implements Serializable {
	@Id
	@Column(name = "awb_No")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int awbNo;

	protected String source;
	protected String destination;
	protected double price;
	protected double weight;

	public int getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(int awbNo) {
		this.awbNo = awbNo;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Shipment [awbNo=" + awbNo + ", source=" + source + ", destination=" + destination + ", price=" + price
				+ ", weight=" + weight + "]";
	}

}
