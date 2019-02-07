package com.bank.challenge.oop;

import java.util.Date;

public class Transaction {

	private Date date;
	private double value;
	private String type;
	private boolean status;
	private String description;
	
	
	
	public Transaction(Date date, double value, String type, boolean status, String description) {
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



	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
