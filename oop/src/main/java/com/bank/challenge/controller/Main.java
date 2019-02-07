package com.bank.challenge.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.bank.challenge.oop.Account;
import com.bank.challenge.oop.Costumer;
import com.bank.challenge.oop.Agent;
import com.bank.challenge.oop.*;
import com.bank.challenge.vista.*;

public class Main {

	public static ArrayList<Costumer> costumerList = new ArrayList<Costumer>();
	public static ArrayList<Agent> agentList = new ArrayList<Agent>();




	public static void main(String[] args) {
		
		
		Account acc = new Account(1, 1, null);
		
		ArrayList<Account> accountList = new ArrayList();
		accountList.add(acc);
		Agent agent ;
		agent = new Cashier(101, "Pedro", false);
		agentList.add(agent);
		agent = new Cashier(102, "Juan", false);
		agentList.add(agent);
		agent = new Cashier(103, "Camilo", false);
		agentList.add(agent);
		agent = new Cashier(104, "Felipe", false);
		agentList.add(agent);
		agent = new Supervisor(201, "David", false);
		agentList.add(agent);
		
		
		
		Costumer costum = new Costumer(1538, "Andres", "2575186", "email@gmail.com", accountList, null);
		Costumer costum1 = new Costumer(8855, "Fabian", "45125364", "lol@gmail.com", accountList, null);
		Costumer costum2 = new Costumer(9898, "Fernando", "846545", "fornite@gmail.com", accountList, null);
		Costumer costum3 = new Costumer(1538, "Ana", "54686", "smite@gmail.com", accountList, null);
		Costumer costum4 = new Costumer(1538, "Daniel", "8496", "ll@gmail.com", accountList, null);
		Costumer costum5 = new Costumer(1538, "Miguel", "754545", "sss@gmail.com", accountList, null);
		Costumer costum6 = new Costumer(1538, "Juan", "884", "wwww@gmail.com", accountList, null);
		Costumer costum7 = new Costumer(1538, "Sofia", "846432", "ddd@gmail.com", accountList, null);
		Costumer costum8 = new Costumer(1538, "Catalina", "684564", "ooooo@gmail.com", accountList, null);

		costumerList.add(costum);
		costumerList.add(costum1);
		costumerList.add(costum2);
		costumerList.add(costum3);
		costumerList.add(costum4);
		costumerList.add(costum5);
		costumerList.add(costum6);
		costumerList.add(costum7);
		costumerList.add(costum8);
		


		String topicName = "SimpleProduceTopic";
		String key = "key1";
		String value = "Value-1";

		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer <String, String> producer = new KafkaProducer<String, String>(props);
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topicName, key, value);
		producer.send(record);
		producer.close();


		System.out.println("Simple Producer COMPLETED");



//
//
//
//		Agent agent  = new Supervisor(0, null, false);
//		if (agent instanceof Supervisor) {
//			System.out.println("Hello THere");
//
//		}
		Interface ventana = new Interface(costumerList,agentList);
	
		ventana.run(ventana);
//		ventana.main(args);
		
	}
	

}	
