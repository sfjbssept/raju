package com.rabitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabitmq.config.RabbitMQConfig;
import com.rabitmq.entity.EmployeeStatus;

@Component
public class EmployeeConsumer {
	
	@RabbitListener(queues = RabbitMQConfig.QUEUENAME)
	public void consumeMessageFromQuque(EmployeeStatus employeeStatus) {
		
		System.out.println("Message Recived -:"+employeeStatus);
	}

}
