package com.dmlop.entities;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable 
{

	protected int bookNo;
	protected String title;
	protected String authorName;
	protected String publisherName;
	protected Date publishDate;
	protected double price;
	
	
	
	public final int getBookNo() {
		return bookNo;
	}
	public final void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getAuthorName() {
		return authorName;
	}
	public final void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public final String getPublisherName() {
		return publisherName;
	}
	public final void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public final Date getPublishDate() {
		return publishDate;
	}
	public final void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", authorName=" + authorName + ", publisherName="
				+ publisherName + ", publishDate=" + publishDate + ", price=" + price + "]";
	}
	
	
	
}
