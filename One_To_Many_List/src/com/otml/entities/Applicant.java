package com.otml.entities;

import java.io.Serializable;
import java.util.Date;

public class Applicant implements Serializable
{
	protected int applicantNo;
	protected String applicantName;
	protected String gender;
	protected Date dob;
	protected String mobileNo;
	protected String aadharNo;
	public int getApplicantNo() {
		return applicantNo;
	}
	public void setApplicantNo(int applicantNo) {
		this.applicantNo = applicantNo;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "Applicant [applicantNo=" + applicantNo + ", applicantName=" + applicantName + ", gender=" + gender
				+ ", dob=" + dob + ", mobileNo=" + mobileNo + ", aadharNo=" + aadharNo + "]";
	}
	
	
	
}
