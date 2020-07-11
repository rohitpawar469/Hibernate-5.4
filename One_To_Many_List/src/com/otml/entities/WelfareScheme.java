package com.otml.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WelfareScheme implements Serializable
{
	protected int schemeNo;
	protected String schemeName;
	protected String criteria;
	protected String category;
	protected Date launchedDate;
	protected int duration;
	List<Applicant> applicants;
	public int getSchemeNo() {
		return schemeNo;
	}
	public void setSchemeNo(int schemeNo) {
		this.schemeNo = schemeNo;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getLaunchedDate() {
		return launchedDate;
	}
	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<Applicant> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicants == null) ? 0 : applicants.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((criteria == null) ? 0 : criteria.hashCode());
		result = prime * result + duration;
		result = prime * result + ((launchedDate == null) ? 0 : launchedDate.hashCode());
		result = prime * result + ((schemeName == null) ? 0 : schemeName.hashCode());
		result = prime * result + schemeNo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WelfareScheme other = (WelfareScheme) obj;
		if (applicants == null) {
			if (other.applicants != null)
				return false;
		} else if (!applicants.equals(other.applicants))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (criteria == null) {
			if (other.criteria != null)
				return false;
		} else if (!criteria.equals(other.criteria))
			return false;
		if (duration != other.duration)
			return false;
		if (launchedDate == null) {
			if (other.launchedDate != null)
				return false;
		} else if (!launchedDate.equals(other.launchedDate))
			return false;
		if (schemeName == null) {
			if (other.schemeName != null)
				return false;
		} else if (!schemeName.equals(other.schemeName))
			return false;
		if (schemeNo != other.schemeNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "WelfareScheme [schemeNo=" + schemeNo + ", schemeName=" + schemeName + ", criteria=" + criteria
				+ ", category=" + category + ", launchedDate=" + launchedDate + ", duration=" + duration
				+ ", applicants=" + applicants + "]";
	}
	
	
	
}
