package com.ft.entities;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable 
{
	protected int feedbackNo;
	protected String comments;
	protected int rating;
	protected Date feedbackPostedDate;
	protected String feedbackUserName;
	protected Product product;
	
	
	public int getFeedbackNo() {
		return feedbackNo;
	}
	public String getComments() {
		return comments;
	}
	public int getRating() {
		return rating;
	}
	public Date getFeedbackPostedDate() {
		return feedbackPostedDate;
	}
	public String getFeedbackUserName() {
		return feedbackUserName;
	}
	public Product getProduct() {
		return product;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + feedbackNo;
		result = prime * result + ((feedbackPostedDate == null) ? 0 : feedbackPostedDate.hashCode());
		result = prime * result + ((feedbackUserName == null) ? 0 : feedbackUserName.hashCode());
		result = prime * result + rating;
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
		Feedback other = (Feedback) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (feedbackNo != other.feedbackNo)
			return false;
		if (feedbackPostedDate == null) {
			if (other.feedbackPostedDate != null)
				return false;
		} else if (!feedbackPostedDate.equals(other.feedbackPostedDate))
			return false;
		if (feedbackUserName == null) {
			if (other.feedbackUserName != null)
				return false;
		} else if (!feedbackUserName.equals(other.feedbackUserName))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Feedback [feedbackNo=" + feedbackNo + ", comments=" + comments + ", rating=" + rating
				+ ", feedbackPostedDate=" + feedbackPostedDate + ", feedbackUserName=" + feedbackUserName + "]";
	}
	
	
	
}
