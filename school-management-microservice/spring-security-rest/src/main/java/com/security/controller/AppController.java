package com.security.controller;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.header.Header;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.security.data.Employee;

@RestController
public class AppController {
	
	@GetMapping("/get")
	public String getDetail() {
		return "Get Employee";
		
	}
	
	@PostMapping("/post")
	Employee saveEmployee(@RequestBody Employee  employee) {
		return employee;
	}

	@PutMapping("/put/{name}")
	String putEmployee(@RequestBody Employee employee,@PathVariable String name) {
		
		return employee.toString()+"Upadated Name->"+name;
		
	}
	
	@DeleteMapping("/delete/{name}")
	String deletEmployee(@PathVariable String name) {
		
		return name;
		
	}
	
	@GetMapping("/path/{name}")
	public String getPath(@PathVariable("name") String name) {
		return name;
		
	}
	
	@GetMapping("/request")
	public String getParamvalue(@RequestParam(name="name",required = true,defaultValue = "Raju")String name ) {
		return "Request Param name"+name;
	}
	
	
	@GetMapping("/requests/param")
	String getRequestParam(@RequestParam List<String> id) {
		
		return "Request Param ->"+id;
	}
	
	
	@GetMapping("/headers")
	public ResponseEntity<String> getHeaders(@RequestHeader HttpHeaders header){
		
		if(isHeaderMissing(header,"name")) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		HttpHeaders headers1 = new HttpHeaders();
		headers1.setExpires(ZonedDateTime.now().plusDays(1));
		String responce="Valid user";
		return ResponseEntity.ok().headers(headers1).body(responce);
		
		
	}

	private boolean isHeaderMissing(HttpHeaders header, String headerKey) {
		if(header.containsKey(headerKey)) {
			return true;
		}else
		return false;
	}
}
