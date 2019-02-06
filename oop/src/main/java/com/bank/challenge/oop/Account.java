package com.bank.challenge.oop;

public class Account {
	
	private int id;
	private int balance;
	private Transaction transactions;
	
	
	//Account Constructor
	public Account (int idAcc, int balanceAcc, Transaction trans) {
		
		this.id = idAcc;
		this.balance = balanceAcc;
		this.transactions = trans;
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


	public Transaction getTransactions() {
		return transactions;
	}


	public void setTransactions(Transaction transactions) {
		this.transactions = transactions;
	}
	
	

}
