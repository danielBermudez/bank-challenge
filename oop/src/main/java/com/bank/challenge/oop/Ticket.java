package com.bank.challenge.oop;

import java.util.Random;

public class Ticket {

	private int id;
	private Costumer costumer;
	private Agent agent;
	private int attentionTime;
	private int account;
	private int status;
	
	
	
	//Agent Constructor
	public Ticket(int idTicket, Costumer costumT, Agent agT, int timeT, int accT, boolean statusT) {
		
		this.id = idTicket;
		this.costumer = costumT;
		this.agent = agT;
		this.attentionTime = timeT;
		this.account = accT;
	}

	

	public Ticket attendTicket (Costumer costum, Agent Ag) {
		
		Random rn = new Random();
		int num = rn.nextInt(2);
		
		
		
		return null;
				
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


	public int isStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}