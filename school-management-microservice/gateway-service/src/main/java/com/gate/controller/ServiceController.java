package com.gate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	/*
	 * @RequestMapping(value = "/getschooldetails/{schoolname}",
	 * method=RequestMethod.GET) public String getSchooldetail(@PathVariable String
	 * schoolname) {
	 * 
	 * System.out.println("Given school name is ->"+schoolname); String
	 * responce=restTemplate.exchange("http://school-service/schooldetail/"+
	 * schoolname, HttpMethod.GET,null,new ParameterizedTypeReference<String>() {
	 * },schoolname).getBody(); return
	 * "School Name"+schoolname+"\n student details"+responce;
	 * 
	 * 
	 * 
	 * }
	 */
	
	@Value("${admin-service}") 
	  String url;
	
	
	@PostMapping("/api/v1.0/flight/search")
	public String getFlightDetail() {
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String > httpEntity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> responce=restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		String result = responce.getBody();
		
		
		return result;
	}
	
	@PostMapping("/api/v1.0/flight/airline/register")
	public String saveFlightDetail() {
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String > httpEntity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> responce=restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		String result = responce.getBody();
		
		
		return result;
	}
	
}
