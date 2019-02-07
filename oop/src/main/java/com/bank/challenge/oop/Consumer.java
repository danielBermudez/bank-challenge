package com.bank.challenge.oop;

import java.util.Arrays;
import java.util.Properties;
import java.util.function.Supplier;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class Consumer {

	public static void main(String[] args) {
		 String topicName = "SupplierTopic";
		 String groupName = "SupplierTopicGroup";
		 
		 Properties props = new Properties();
		 props.put("bootstrap.servers", "localhost:9092");
	     props.put("group.id", "test");
	     props.put("enable.auto.commit", "true");
	     props.put("auto.commit.interval.ms", "1000");
	     props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
	     props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		 
		 KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
		 consumer.subscribe(Arrays.asList(topicName));
		 
		 while(true) {
			 ConsumerRecords<String, String> records = consumer.poll(100);
			 for (ConsumerRecord<String, String> record : records) {
	             System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
			}
		 }
		 
		 
	}
	
}
