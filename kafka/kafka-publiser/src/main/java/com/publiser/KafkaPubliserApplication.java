package com.publiser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class KafkaPubliserApplication {
	
	
	@Autowired
	private KafkaTemplate<String, Object> template;

	private String topic = "spring-kafka";

	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		template.send(topic, "Hi " + name + " this is to inform that this message is coming frm your kafka publisher!");
		return "Data has been published";

	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaPubliserApplication.class, args);
	}

}
