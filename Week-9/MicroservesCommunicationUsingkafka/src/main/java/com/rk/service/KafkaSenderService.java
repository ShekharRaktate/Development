package com.rk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderService {
	@Autowired
	private KafkaTemplate<String, String>template;
	String topic="myTopic";
	public void sendMessage(String msg) {
		template.send(topic,msg);
	}
}
