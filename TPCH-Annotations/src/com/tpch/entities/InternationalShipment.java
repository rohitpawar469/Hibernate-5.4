package com.tpch.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("International_Shipment")
public class InternationalShipment extends Shipment 
{
	@Column(name="shipment_Mode")
	protected String shipmentMode;
	protected double tax;
	
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return "InternationalShipment [shipmentMode=" + shipmentMode + ", tax=" + tax + ", awbNo=" + awbNo + ", source="
				+ source + ", destination=" + destination + ", price=" + price + ", weight=" + weight + "]";
	}
	
	
	
}
