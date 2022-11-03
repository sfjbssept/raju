package com.sqs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsSqsDemoApplication {
	
	
	Logger logger=LoggerFactory.getLogger(SpringAwsSqsDemoApplication.class);
	
	@Autowired
	private QueueMessagingTemplate messagingTemplate;
	
	
	
	@Value("${cloud.aws.end-point.uri}")
	private String endPoint ;
	
	@GetMapping("/send/{message}")
	public void  sendMessageToQueue(@PathVariable String message) {
		messagingTemplate.send(endPoint,MessageBuilder.withPayload(message).build());
		
	}
	
	@SqsListener("raju-queue")
	public void loadMessageFromQueue(String message) {
		
		logger.info("This message is read from Queue{}"+message);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSqsDemoApplication.class, args);
	}

}
