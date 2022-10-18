package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	  @Autowired 
	  private RestTemplate restTemplate;
	 
	
	@Value("${admin-service}") 
	private String url;
	 
	
	@PostMapping("/registeruser")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}

	@PostMapping("/api/v1.0/flight/search")
	public String getFlightDetail() {
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String > httpEntity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> responce=restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		String result = responce.getBody();
		
		
		return result;
	}
}
