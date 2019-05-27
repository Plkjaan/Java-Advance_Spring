package com.cdac.spring;

public class WhatsAppMessage implements IMessage {

	private String name;
	
	
	
	public WhatsAppMessage() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String sendMessage(String name) {
		
		return "Welcome to whatsApp Message !"+name+"  , Hello From Spring !!!";
	}

}
