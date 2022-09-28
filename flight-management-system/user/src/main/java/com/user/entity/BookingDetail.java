package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingDetail {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	private String pnr;
	private String bookFrom;
	private String bookrdTo;
	private String bookedDate;
	private String numberOfSeat;
	private String meal;
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	
	public String getBookFrom() {
		return bookFrom;
	}
	public void setBookFrom(String bookFrom) {
		this.bookFrom = bookFrom;
	}
	public String getBookrdTo() {
		return bookrdTo;
	}
	public void setBookrdTo(String bookrdTo) {
		this.bookrdTo = bookrdTo;
	}
	public String getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}
	public String getNumberOfSeat() {
		return numberOfSeat;
	}
	public void setNumberOfSeat(String numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	
	
	
}
