package com.admin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_detail")
public class FlightDetails {
	
	
	@Id
	private Integer flightNumber;
	private String airlineName;
	private String flyFrom;
	private String flyto;
	private Date satrtDateTime;
	private Date endDateTime;
	private String instrumentUsed;
	private Integer totalNoBSeat;
	private Integer toTalNoESeat;
	private Double ticketCost;
	private Integer numberOfrow;
	private String scheduledDay;
	public FlightDetails() {
		super();
	}
	public FlightDetails(Integer flightNumber, String airlineName, String flyFrom, String flyto, Date satrtDateTime,
			Date endDateTime, String instrumentUsed, Integer totalNoBSeat, Integer toTalNoESeat, Double ticketCost,
			Integer numberOfrow, String scheduledDay) {
		super();
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.flyFrom = flyFrom;
		this.flyto = flyto;
		this.satrtDateTime = satrtDateTime;
		this.endDateTime = endDateTime;
		this.instrumentUsed = instrumentUsed;
		this.totalNoBSeat = totalNoBSeat;
		this.toTalNoESeat = toTalNoESeat;
		this.ticketCost = ticketCost;
		this.numberOfrow = numberOfrow;
		this.scheduledDay = scheduledDay;
	}
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFlyFrom() {
		return flyFrom;
	}
	public void setFlyFrom(String flyFrom) {
		this.flyFrom = flyFrom;
	}
	public String getFlyto() {
		return flyto;
	}
	public void setFlyto(String flyto) {
		this.flyto = flyto;
	}
	public Date getSatrtDateTime() {
		return satrtDateTime;
	}
	public void setSatrtDateTime(Date satrtDateTime) {
		this.satrtDateTime = satrtDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public Integer getTotalNoBSeat() {
		return totalNoBSeat;
	}
	public void setTotalNoBSeat(Integer totalNoBSeat) {
		this.totalNoBSeat = totalNoBSeat;
	}
	public Integer getToTalNoESeat() {
		return toTalNoESeat;
	}
	public void setToTalNoESeat(Integer toTalNoESeat) {
		this.toTalNoESeat = toTalNoESeat;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public Integer getNumberOfrow() {
		return numberOfrow;
	}
	public void setNumberOfrow(Integer numberOfrow) {
		this.numberOfrow = numberOfrow;
	}
	public String getScheduledDay() {
		return scheduledDay;
	}
	public void setScheduledDay(String scheduledDay) {
		this.scheduledDay = scheduledDay;
	}
	
	
	

}
