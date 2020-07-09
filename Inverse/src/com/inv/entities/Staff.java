package com.inv.entities;

import java.io.Serializable;

public class Staff  implements Serializable
{
	protected int staffNo;
	protected String fullName;
	protected int age;
	protected String gender;
	protected String mobileNo;
	protected Branch branch;
	
	public int getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
	
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", fullName=" + fullName + ", age=" + age + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", branch=" + branch + "]";
	}
	
	
	 
	
}
