package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entity.FlightDetails;
import com.admin.service.FlightDetailService;
import java.util.List;
import java.util.Optional;

@RestController
public class FlightDetailController {
	
	
	@Autowired
	private FlightDetailService flightDetailService;
	
	
	@PostMapping("/flightdetail")
	public FlightDetails saveFlight(@RequestBody FlightDetails flightDetails) {
		
		FlightDetails details= flightDetailService.saveFlight(flightDetails);
		
		return details;
		
		
	}
	
	@GetMapping("/getAllflight")
	public List<FlightDetails> getAllFlight() {
		
		return flightDetailService.getAllFlight();
		
	}
	@GetMapping("/getGlight/{flightNumber}")
	
	public Optional<FlightDetails> getFlightbyId(@PathVariable Integer id) {
		
		return flightDetailService.getFlightById(id);
	}
	
	@PutMapping("/updateFlight/{flightNumber}")
	
     public FlightDetails updaetFlight(@RequestBody FlightDetails flightDetails,@PathVariable Integer flightNumber) {
		
		FlightDetails details= flightDetailService.UpdateFlight(flightDetails,flightNumber);
		
		return details;
		
		
	}
	
	@DeleteMapping("deleteFlight/")
	
	public void deleteFlight(@PathVariable Integer id) {
		
		flightDetailService.deleteById(id);
		
	}
	
	

}
