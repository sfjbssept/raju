package com.school.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/schooldetail")
public class SchoolServiceController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	  @Value("${student.URL}") 
	  String url;
	 
	
	@GetMapping("/{schoolname}")
	public String getStudent(@PathVariable("schoolname") String schoolname) {
		
		//String url="http://localhost:9091/getstudent/forschool/"+schoolname;
		System.out.println(url+schoolname);
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String > httpEntity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> responce=restTemplate.exchange(url+schoolname, HttpMethod.GET, httpEntity, String.class);
		
		String result = responce.getBody();
		
		
		return schoolname+"\n student detail"+result;
		
		
		
	}
	
	
	
	

}
