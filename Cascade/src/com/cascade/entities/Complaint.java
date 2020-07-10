package com.cascade.entities;

import java.io.Serializable;
import java.util.Date;

public class Complaint implements Serializable
{
	protected int complaintNo;
	protected String title;
	protected String description;
	protected Date reportedDate;
	protected int priority;
	protected int severity;
	protected String Status;
	
	public int getComplaintNo() {
		return complaintNo;
	}
	public void setComplaintNo(int complaintNo) {
		this.complaintNo = complaintNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReportedDate() {
		return reportedDate;
	}
	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return "Complaint [complaintNo=" + complaintNo + ", title=" + title + ", description=" + description
				+ ", reportedDate=" + reportedDate + ", priority=" + priority + ", severity=" + severity + ", Status="
				+ Status + "]";
	}
	
	
	
	
}
