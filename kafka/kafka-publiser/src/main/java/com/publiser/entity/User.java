package com.publiser.entity;

import java.util.Arrays;

public class User {
	
	private Integer userID;
	private String userName;
	private String[] address;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public User(Integer userID, String userName, String[] address) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.address = address;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", address=" + Arrays.toString(address) + "]";
	}
	
	

}
