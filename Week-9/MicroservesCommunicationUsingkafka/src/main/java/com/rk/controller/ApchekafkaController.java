package com.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rk.service.KafkaSenderService;

@RestController
public class ApchekafkaController {
	@Autowired
	private KafkaSenderService senderService;
	@GetMapping("/produces/{msg}")	
	public String sendMessage(@PathVariable String msg) {
		senderService.sendMessage(msg);
		return "Message send thorugh kafka topic is myTopic sucessfully..!";
		
	}
}
