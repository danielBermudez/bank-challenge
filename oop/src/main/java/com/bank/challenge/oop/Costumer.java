package com.bank.challenge.oop;

public class Costumer {
	
	private int id;
	private String name;
	private String phone;
	private String email;
	private Account [] account;
	private Issue issues;
	
	
	//Costumer Constructor
	
	public Costumer(int idCostumer, String nameCostumer, String phoneCostumer, String emailCostumer, Account [] accountCostumer, Issue pqrCostumer ) {
		
		this.id = idCostumer;
		this.name = nameCostumer;
		this.phone = phoneCostumer;
		this.email = emailCostumer;
		this.account = accountCostumer;
		this.issues = pqrCostumer;
		
	}

	
	
	//Setters and Getters for each attribute

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public Account[] getAccount() {
		return account;
	}



	public void setAccount(Account[] account) {
		this.account = account;
	}



	public Issue getIssues() {
		return issues;
	}



	public void setIssues(Issue issues) {
		this.issues = issues;
	}

}
