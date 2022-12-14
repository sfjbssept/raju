package com.spring.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsDeployApplication {
	
	@GetMapping("demo/aws")
	public String demoASW() {
		return "You are getting the data from AWS cloud";
	}

	@GetMapping("/{name}")
	public String welcome(@PathVariable String name) {
		return "Hi"+name;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsDeployApplication.class, args);
	}

}
