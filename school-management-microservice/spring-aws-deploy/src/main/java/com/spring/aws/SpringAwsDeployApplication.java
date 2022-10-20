package com.spring.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsDeployApplication {
	
	@GetMapping("demo/aws")
	public String demoASW() {
		return "You are getting the data from AWS cloud";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsDeployApplication.class, args);
	}

}
