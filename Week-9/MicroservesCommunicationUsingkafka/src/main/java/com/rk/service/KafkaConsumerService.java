package com.rk.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	@KafkaListener(topics="myTopic", groupId="gr-1")
	public void consumeMessage(String msg) {
		System.out.println("Received Message:"+msg);
	}
}
