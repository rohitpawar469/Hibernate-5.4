package com.idg.hilo.entities;

import java.io.Serializable;

public class Feedback implements Serializable {
	protected int feedbackNo;
	protected String feedbackName;
	protected String userName;
	protected String description;
	protected String productName;
	protected int rating;

	public final int getFeedbackNo() {
		return feedbackNo;
	}

	public final void setFeedbackNo(int feedbackNo) {
		this.feedbackNo = feedbackNo;
	}

	public final String getFeedbackName() {
		return feedbackName;
	}

	public final void setFeedbackName(String feedbackName) {
		this.feedbackName = feedbackName;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final String getProductName() {
		return productName;
	}

	public final void setProductName(String productName) {
		this.productName = productName;
	}

	public final int getRating() {
		return rating;
	}

	public final void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FeedBack [feedbackNo=" + feedbackNo + ", feedbackName=" + feedbackName + ", userName=" + userName
				+ ", description=" + description + ", productName=" + productName + ", rating=" + rating + "]";
	}

}
