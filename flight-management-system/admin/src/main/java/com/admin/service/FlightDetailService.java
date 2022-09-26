package com.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.FlightDetails;
import com.admin.repo.FlightDetailRepo;

@Service
public class FlightDetailService {
	
	@Autowired
	FlightDetailRepo flightDetailRepo;

	public FlightDetails saveFlight(FlightDetails flightDetails) {
		return flightDetailRepo.save(flightDetails);
	}

	public List<FlightDetails> getAllFlight() {
		
		return flightDetailRepo.findAll();
	}

	public FlightDetails UpdateFlight(FlightDetails flightDetails, Integer flightNumber) {
		FlightDetails existingdetails=flightDetailRepo.findById(flightNumber).orElseThrow();
		existingdetails.setFlightNumber(flightDetails.getFlightNumber());
		existingdetails.setAirlineName(flightDetails.getAirlineName());
		existingdetails.setEndDateTime(flightDetails.getEndDateTime());
		existingdetails.setFlyFrom(flightDetails.getFlyFrom());
		existingdetails.setInstrumentUsed(flightDetails.getInstrumentUsed());
		existingdetails.setFlyto(flightDetails.getFlyto());
		existingdetails.setSatrtDateTime(flightDetails.getSatrtDateTime());
		existingdetails.setScheduledDay(flightDetails.getScheduledDay());
		existingdetails.setTicketCost(flightDetails.getTicketCost());
		existingdetails.setNumberOfrow(flightDetails.getNumberOfrow());
		existingdetails.setTotalNoBSeat(flightDetails.getTotalNoBSeat());
		existingdetails.setToTalNoESeat(flightDetails.getToTalNoESeat());
		flightDetailRepo.save(existingdetails);
		return existingdetails;
	}

	public Optional<FlightDetails> getFlightById(Integer id) {
		
		return flightDetailRepo.findById(id);
	}

	public void deleteById(Integer id) {
		
		flightDetailRepo.deleteById(id);
	}
	

}
