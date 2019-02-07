package com.bank.challenge.oop;

import java.beans.Customizer;
import java.util.Date;
import java.util.Random;

public class Cashier extends Agent{

	
	public Cashier(int idAgent, String nameAgent, boolean statusAgent) {
		super(idAgent, nameAgent, statusAgent);
	}

	
	
	@Override
	public Transaction deposit(Costumer costum, int value) {

		Transaction transaction;
		Random randomValue = new Random();
		int newValue = randomValue.nextInt(value);
		
		try {
			if (value > 0) {
				
				transaction = new Transaction(new Date(), newValue, "Deposit", true, "Se deposita un valor en la cuenta del cliente");
				if (costum.getAccount() != null) {
					
				}
				System.out.println("No se ha ingresado ningun valor");
			}else {
				
			}
		}catch (Exception e) {
			System.out.println("No se pudo ingresar el valor a la cuenta del usuario");
		}
		return null;
		
	}

	@Override
	public void withdraw(Costumer costum, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void issues(Costumer costum) {
		// TODO Auto-generated method stub
		
	}
	

}
