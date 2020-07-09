package com.inv.entities;

import java.io.Serializable;
import java.util.Set;

public class Branch implements Serializable
{
	protected int branchNo;
	protected String branchName;
	protected String organisationName;
	protected String contactNo;
	protected String emailAddress;
	protected String location;
	protected Set<Staff> branchStaff;
	
	
	public int getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Staff> getBranchStaff() {
		return branchStaff;
	}
	public void setBranchStaff(Set<Staff> branchStaff) {
		this.branchStaff = branchStaff;
	}
	
	
	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", organisationName=" + organisationName
				+ ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + ", location=" + location
				+ ", branchStaff=" + branchStaff + "]";
	}
	
	
	
	
}
