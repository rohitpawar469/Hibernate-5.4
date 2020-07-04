package com.mtmm.entities;

import java.io.Serializable;
import java.util.Map;

public class SportsClub implements Serializable 
{
	protected int clubNo;
	protected String clubName;
	protected String chairman;
	protected String location;
	protected double fees;
	Map<String , Person> members;
	
	public int getClubNo() 
	{
		return clubNo;
	}
	
	public void setClubNo(int clubNo) {
		this.clubNo = clubNo;
	}
	
	public String getClubName() {
		return clubName;
	}
	
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	public String getChairman() {
		return chairman;
	}
	
	public void setChairman(String chairman) {
		this.chairman = chairman;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Map<String, Person> getMembers() {
		return members;
	}
	public void setMembers(Map<String, Person> members) {
		this.members = members;
	}
	
	@Override
	public String toString() {
		return "SportsClub [clubNo=" + clubNo + ", clubName=" + clubName + ", chairman=" + chairman + ", location="
				+ location + ", fees=" + fees + ", members=" + members + "]";
	}
	
	
}
