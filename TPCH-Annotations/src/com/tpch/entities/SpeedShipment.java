package com.tpch.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("SpeedShipment")
public class SpeedShipment extends Shipment  
{	
	@Column(name="days_To_Deliver")
	protected int daysToDeiver;
	
	protected String instructions;

	public int getDaysToDeiver() {
		return daysToDeiver;
	}

	public void setDaysToDeiver(int daysToDeiver) {
		this.daysToDeiver = daysToDeiver;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return "SpeedShipment [daysToDeiver=" + daysToDeiver + ", instructions=" + instructions + ", awbNo=" + awbNo
				+ ", source=" + source + ", destination=" + destination + ", price=" + price + ", weight=" + weight
				+ "]";
	}
	
	
}
