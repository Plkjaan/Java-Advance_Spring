package com.cdac.spring.service;

public class OlaCabService implements ICabService {

	 private String name ;
	 
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OlaCabService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String bookCab(String name) {
		
		return "Ola booking a cab for"+name ;
	}

}
