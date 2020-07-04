package com.atpsc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="speed_Shipment")
@PrimaryKeyJoinColumn
public class SpeedShipment extends Shipment
{
	@Column(name="days_To_Deliver")
	protected int daysToDeliver;
	protected String instructions;
	
	
	public int getDaysToDeliver() {
		return daysToDeliver;
	}
	public void setDaysToDeliver(int daysToDeliver) {
		this.daysToDeliver = daysToDeliver;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	@Override
	public String toString() {
		return "SpeedShipment [daysToDeliver=" + daysToDeliver + ", instructions=" + instructions + ", awbNo=" + awbNo
				+ ", source=" + source + ", destination=" + destination + ", weight=" + weight + ", amount=" + amount
				+ "]";
	}
	
	
	
	
}


