package com.activemq.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class ProducerResource {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	Queue queue;	
	
	
	@GetMapping("/{msg}")
	public String publish(@PathVariable String msg) {
		jmsTemplate.convertAndSend(queue,msg);
		return "Published sucessfully"+ msg;
	}

}
