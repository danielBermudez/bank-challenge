package com.bank.challenge.oop;

public class Ticket {

	private int id;
	private Costumer costumer;
	private Agent agent;
	private int attentionTime;
	private int account;
	private boolean status;
	
	
	
	//Agent Constructor
	public Ticket(int idTicket, Costumer costumT, Agent agT, int timeT, int accT, boolean statusT) {
		
		this.id = idTicket;
		this.costumer = costumT;
		this.agent = agT;
		this.attentionTime = timeT;
		this.account = accT;
	}

	

	
	//Getters and Setters of the attributes

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Costumer getCostumer() {
		return costumer;
	}


	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}


	public Agent getAgent() {
		return agent;
	}


	public void setAgent(Agent agent) {
		this.agent = agent;
	}


	public int getAttentionTime() {
		return attentionTime;
	}


	public void setAttentionTime(int attentionTime) {
		this.attentionTime = attentionTime;
	}


	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}