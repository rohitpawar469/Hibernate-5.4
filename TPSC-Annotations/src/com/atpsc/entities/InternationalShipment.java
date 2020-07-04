package com.atpsc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="international_Shipment")
@PrimaryKeyJoinColumn
public class InternationalShipment  extends Shipment 
{
	@Column(name="shipment_Mode")
	protected String shipmentMode;
	@Column(name="tax_Amount")
	protected double taxAmount;
	
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	@Override
	public String toString() {
		return "InternationalShipment [shipmentMode=" + shipmentMode + ", taxAmount=" + taxAmount + ", awbNo=" + awbNo
				+ ", source=" + source + ", destination=" + destination + ", weight=" + weight + ", amount=" + amount
				+ "]";
	}
	
	
	
}
