package com.school.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SchoolserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolserviceApplication.class, args);
	}

}
