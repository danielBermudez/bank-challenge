package com.bank.challenge.oop;

import java.util.ArrayList;
import java.util.Random;

public class Dispatcher {

	private ArrayList<Costumer> costumer;
	private ArrayList<Agent> agent;
	private ArrayList<Ticket> ticket;
	
	public void attend() {
		Random aleatorio = new Random(System.currentTimeMillis());
		Ticket ticket ;
		for (int i=0;i<costumer.size();i++) {
			for (int n=0;n<agent.size();n++) {
				if(agent.get(n) instanceof Cashier && agent.get(n).isStatus()) {
					 ticket = new Ticket(n, costumer.get(i),agent.get(n), aleatorio.nextInt(15),costumer.get(i).getAccount().get(aleatorio.nextInt(costumer.get(i).getAccount().size())), true);
					
					
				}else if(agent.get(n) instanceof Supervisor && agent.get(n).isStatus()) {
					 ticket = new Ticket(n, costumer.get(i),agent.get(n), aleatorio.nextInt(15),costumer.get(i).getAccount().get(aleatorio.nextInt(costumer.get(i).getAccount().size())), true);
				
				}else if(agent.get(n) instanceof Supervisor && agent.get(n).isStatus()) {
					 ticket = new Ticket(n, costumer.get(i),agent.get(n), aleatorio.nextInt(15),costumer.get(i).getAccount().get(aleatorio.nextInt(costumer.get(i).getAccount().size())), true);
				
			}}
			
			
		}
	}

	public ArrayList<Costumer> getCostumer() {
		return costumer;
	}

	public void setCostumer(ArrayList<Costumer> costumer) {
		this.costumer = costumer;
	}

	public ArrayList<Agent> getAgent() {
		return agent;
	}

	public void setAgent(ArrayList<Agent> agent) {
		this.agent = agent;
	}

	public ArrayList<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(ArrayList<Ticket> ticket) {
		this.ticket = ticket;
	}
	
	
	
	
	
	
	



	
	

}
