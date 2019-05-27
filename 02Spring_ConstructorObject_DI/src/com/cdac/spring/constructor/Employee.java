package com.cdac.spring.constructor;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	
	private Address  address;
	
	public Employee() {
		
	}

	public Employee(int empId, String firstName, String lastName, Address address) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}

	
	
	
}
