package com.otmm.entities;

import java.io.Serializable;

public class Project implements Serializable 
{
	protected int projectNo;
	protected String projectName;
	protected String domain;
	protected int duration;
	protected double allotedBudget;
	
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getAllotedBudget() {
		return allotedBudget;
	}
	public void setAllotedBudget(double allotedBudget) {
		this.allotedBudget = allotedBudget;
	}
	
	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", projectName=" + projectName + ", domain=" + domain + ", duration="
				+ duration + ", allotedBudget=" + allotedBudget + "]";
	}
	
	
	
}
