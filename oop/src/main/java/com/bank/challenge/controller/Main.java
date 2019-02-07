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
import com.bank.challenge.vista.*;

public class Main {

	public static ArrayList<Costumer> costumerList = new ArrayList<Costumer>();




	public static void main(String[] args) {
		
		Account [] hola = new Account[3];
		Account acc = new Account(1, 1, null);
		hola[0] = acc;

		Costumer costum = new Costumer(1538, "Andres", "2575186", "email@gmail.com", hola, null);
		Costumer costum1 = new Costumer(8855, "Chumajer", "45125364", "lol@gmail.com", hola, null);
		Costumer costum2 = new Costumer(9898, "Felipinho", "846545", "fornite@gmail.com", hola, null);
		Costumer costum3 = new Costumer(1538, "Yasuo", "54686", "smite@gmail.com", hola, null);
		Costumer costum4 = new Costumer(1538, "K6", "8496", "ll@gmail.com", hola, null);
		Costumer costum5 = new Costumer(1538, "Morgana", "754545", "sss@gmail.com", hola, null);
		Costumer costum6 = new Costumer(1538, "Kyale", "884", "wwww@gmail.com", hola, null);
		Costumer costum7 = new Costumer(1538, "Lol", "846432", "ddd@gmail.com", hola, null);
		Costumer costum8 = new Costumer(1538, "Tomas", "684564", "ooooo@gmail.com", hola, null);

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
		Interface ventana = new Interface(costumerList,null);
	
		ventana.run(ventana);
//		ventana.main(args);
		
	}
	

}	
