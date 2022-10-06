package com.rabitmq.entity;


public class Employee {
	
	private String employeeId;
	private String name;
	private int salry;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalry() {
		return salry;
	}
	public void setSalry(int salry) {
		this.salry = salry;
	}
	public Employee(String employeeId, String name, int salry) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salry = salry;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salry=" + salry + "]";
	}
	
	

}
