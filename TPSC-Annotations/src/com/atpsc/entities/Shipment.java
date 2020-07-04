package com.atpsc.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="shipment")
@Inheritance(strategy = InheritanceType.JOINED)

public class Shipment implements Serializable
{
	@Id
	@Column(name="awb_No")
	protected int awbNo;
	
	protected String source;
	protected String destination;
	protected double weight;
	protected double amount;
	
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Shipment [awbNo=" + awbNo + ", source=" + source + ", destination=" + destination + ", weight=" + weight
				+ ", amount=" + amount + "]";
	}
	
	
	
	
}
