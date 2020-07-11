package com.otmm.entities;

import java.io.Serializable;
import java.util.Map;

public class Freelancer implements Serializable 
{
	protected int freelancerNo;
	protected String freelancerName;
	protected int experience;
	protected String technologies;
	protected Map<String, Project> awardedprojects;
	
	public int getFreelancerNo()
	{
		return freelancerNo;
	}
	public void setFreelancerNo(int freelancerNo) {
		this.freelancerNo = freelancerNo;
	}
	public String getFreelancerName() {
		return freelancerName;
	}
	public void setFreelancerName(String freelancerName) {
		this.freelancerName = freelancerName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public Map<String, Project> getAwardedprojects() {
		return awardedprojects;
	}
	public void setAwardedprojects(Map<String, Project> awardedprojects) {
		this.awardedprojects = awardedprojects;
	}
	
	
	@Override
	public String toString() {
		return "Freelancer [freelancerNo=" + freelancerNo + ", freelancerName=" + freelancerName + ", experience="
				+ experience + ", technologies=" + technologies + ", awardedprojects=" + awardedprojects + "]";
	}
	
	
	
	
}
