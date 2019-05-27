package com.cdac.spring.service;

public class UberCabService implements ICabService {

	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UberCabService() {
		
	}

	@Override
	public String bookCab(String name) {
		
		return "Uber cab booking for "+name;
	}

}
