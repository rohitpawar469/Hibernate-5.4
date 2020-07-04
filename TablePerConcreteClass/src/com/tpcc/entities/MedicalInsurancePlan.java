package com.tpcc.entities;

public class MedicalInsurancePlan extends InsurancePlan
{
	protected String networkType;
	protected int copay;
	protected boolean cashlessFacilityAvailable;
	
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	public int getCopay() {
		return copay;
	}
	public void setCopay(int copay) {
		this.copay = copay;
	}
	public boolean isCashlessFacilityAvailable() {
		return cashlessFacilityAvailable;
	}
	public void setCashlessFacilityAvailable(boolean cashlessFacilityAvailable) {
		this.cashlessFacilityAvailable = cashlessFacilityAvailable;
	}
	@Override
	public String toString() {
		return "MedicalInsurancePlan [networkType=" + networkType + ", copay=" + copay + ", cashlessFacilityAvailable="
				+ cashlessFacilityAvailable + ", planNo=" + planNo + ", planName=" + planName + ", minTenure="
				+ minTenure + ", maxTenure=" + maxTenure + ", minAge=" + minAge + ", maxAge=" + maxAge
				+ ", minInsurredAmount=" + minInsurredAmount + ", maxInsurredAmount=" + maxInsurredAmount + "]";
	}
	
	
	

}
