package com.gvl.entities;

import java.io.Serializable;

public class Person implements Serializable
{
	protected int personNo;
	protected String personName;
	protected String age;
	protected String gender;
	protected int mobileNo;
	protected String emailAddress;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	
	
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Person [personNo=" + personNo + ", personName=" + personName + ", age=" + age + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", country=" + country + "]";
	}	
}
