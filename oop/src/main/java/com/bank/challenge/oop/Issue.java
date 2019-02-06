package com.bank.challenge.oop;

import java.util.Date;

public class Issue {

	private Date date;
	private String description;
	private String status;
	
	
	
	
	public Issue(Date dateIssue, String descriptionDes, String statusDescrip) {
		this.date = dateIssue;
		this.description = descriptionDes;
		this.status = statusDescrip;
		
	}
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
