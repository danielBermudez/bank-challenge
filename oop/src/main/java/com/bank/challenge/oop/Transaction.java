package com.bank.challenge.oop;

import java.util.Date;

public class Transaction {

	private Date date;
	private double value;
	private String type;
	private String status;
	private String description;
	
	
	
	public Transaction(Date date, double value, String type, String status, String description) {
		super();
		this.date = date;
		this.value = value;
		this.type = type;
		this.status = status;
		this.description = description;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public double getValue() {
		return value;
	}



	public void setValue(double value) {
		this.value = value;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
