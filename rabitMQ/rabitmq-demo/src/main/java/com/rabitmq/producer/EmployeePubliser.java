package com.rabitmq.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabitmq.config.RabbitMQConfig;
import com.rabitmq.entity.Employee;
import com.rabitmq.entity.EmployeeStatus;

@RestController
@RequestMapping("/employee")
public class EmployeePubliser {
	
	@Autowired
	private RabbitTemplate restTemplate;
	
	@PostMapping("/")
	public String saveEmployee(@RequestBody Employee employee) {
		
		employee.setEmployeeId(UUID.randomUUID().toString());
		EmployeeStatus employeeStatus=new EmployeeStatus(employee,"Joined","Have joined ecently");
		
		restTemplate.convertAndSend(RabbitMQConfig.EXCHANGENAME,RabbitMQConfig.ROUTINGKEY,employeeStatus);
		
		return "sucess";
	}

}
