package com.mtmm.entities;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable 
{
	protected int personNo;
	protected String personName;
	protected Date dob;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	
	
	public int getPersonNo() {
		return personNo;
	}
	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Person [personNo=" + personNo + ", personName=" + personName + ", dob=" + dob + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
	
}
