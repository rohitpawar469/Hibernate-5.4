package com.atpcc.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name="speed_Shipment")
//@AttributeOverrides( {@AttributeOverride(name ="awbNo" , column = "speed_awb_No")} )
public class SpeedShipment extends Shipment {
	
	@Column(name = "days_To_Deliver")
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
