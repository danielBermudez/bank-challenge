package com.bank.challenge.oop;

public class Main {

	public static void main(String[] args) {

		Agent agent = new Supervisor(0, null, false);
		if (agent instanceof Supervisor) {
			System.out.println("Hello THere");
		}
	}

}	
