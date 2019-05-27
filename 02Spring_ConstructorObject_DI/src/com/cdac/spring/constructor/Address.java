package com.cdac.spring.constructor;

public class Address {

	private String city;
	private String state;
	private String counrty;
	
	
	
	public Address(String city, String state, String counrty) {
		super();
		this.city = city;
		this.state = state;
		this.counrty = counrty;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [city : " + city + ", state : " + state + ", counrty : " + counrty + "]";
	}

	
}
