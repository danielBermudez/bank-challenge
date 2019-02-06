package com.bank.challenge.oop;

public class Account {
	
	private int id;
	private int balance;
	
	
	//Account Constructor
	public Account (int idAcc, int balanceAcc) {
		
		this.id = idAcc;
		this.balance = balanceAcc;
		
	}
	
	
	//Getters and Setters of the attributes

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
