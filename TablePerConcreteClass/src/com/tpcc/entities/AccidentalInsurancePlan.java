package com.tpcc.entities;

public class AccidentalInsurancePlan extends InsurancePlan 
{
	
	protected String coverageType;
	protected boolean internationalCoverage;
	protected String travelType;
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public boolean isInternationalCoverage() {
		return internationalCoverage;
	}
	public void setInternationalCoverage(boolean internationalCoverage) {
		this.internationalCoverage = internationalCoverage;
	}
	public String getTravelType() {
		return travelType;
	}
	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}
	
	@Override
	public String toString() {
		return "AccidentalInsurancePlan [coverageType=" + coverageType + ", internationalCoverage="
				+ internationalCoverage + ", travelType=" + travelType + ", planNo=" + planNo + ", planName=" + planName
				+ ", minTenure=" + minTenure + ", maxTenure=" + maxTenure + ", minAge=" + minAge + ", maxAge=" + maxAge
				+ ", minInsurredAmount=" + minInsurredAmount + ", maxInsurredAmount=" + maxInsurredAmount + "]";
	}
	
}