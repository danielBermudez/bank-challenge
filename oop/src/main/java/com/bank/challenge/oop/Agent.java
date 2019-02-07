package com.bank.challenge.oop;

public abstract class Agent {
	
	private int id;
	private String name;
	private boolean status;
	
	
	//Agent Constructor
	public Agent (int idAgent, String nameAgent, boolean statusAgent) {
		
		this.id = idAgent;
		this.name = nameAgent;
		this.status = statusAgent;
		
	}
	
	
	//Abstract method that introduce money into a costumer bank account
	public abstract Transaction deposit(Costumer costum, int value);
	
	//Abstract method that retrieve money of a costumer bank account	
	public abstract void withdraw(Costumer costum, int value);
	
	//Abstract method that attend the issues of the costumer
	public abstract void issues(Costumer costum);


	
	//Getters and Setters of the attributes
	
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


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
