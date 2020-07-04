package com.tpsc.entities;

import java.io.Serializable;

public class InsurancePlan implements Serializable
{
	protected int planNo;
	protected String planName;
	protected int minTenure;
	protected int maxTenure;
	protected int minAge;
	protected int maxAge;
	protected int minInsurredAmount;
	protected int maxInsurredAmount;
	
	
	public int getPlanNo() {
		return planNo;
	}


	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public int getMinTenure() {
		return minTenure;
	}


	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}


	public int getMaxTenure() {
		return maxTenure;
	}


	public void setMaxTenure(int maxTenure) {
		this.maxTenure = maxTenure;
	}


	public int getMinAge() {
		return minAge;
	}


	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}


	public int getMaxAge() {
		return maxAge;
	}


	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}


	public int getMinInsurredAmount() {
		return minInsurredAmount;
	}


	public void setMinInsurredAmount(int minInsurredAmount) {
		this.minInsurredAmount = minInsurredAmount;
	}


	public int getMaxInsurredAmount() {
		return maxInsurredAmount;
	}


	public void setMaxInsurredAmount(int maxInsurredAmount) {
		this.maxInsurredAmount = maxInsurredAmount;
	}


	@Override
	public String toString() {
		return "InsurancePlan [planNo=" + planNo + ", planName=" + planName + ", minTenure=" + minTenure
				+ ", maxTenure=" + maxTenure + ", minAge=" + minAge + ", maxAge=" + maxAge + ", minInsurredAmount="
				+ minInsurredAmount + ", maxInsurredAmount=" + maxInsurredAmount + "]";
	}
	
	
	
}
