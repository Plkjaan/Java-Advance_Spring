package com.cdac.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.spring.service.ICabService;
import com.cdac.spring.service.OlaCabService;

public class MessageClient {

	public static void main(String[] args) {
		//Spring configuration file
		String configLocation = "NewFile.xml";
		
		//create spring container
		ApplicationContext springContainer  = new ClassPathXmlApplicationContext(configLocation);
		//1>ClassPathXmlApplicationContext
		//2>FileSystemXmlApplicationContext
		//3>
		
		
		IMessage whatsAppMessage= (IMessage) springContainer.getBean("whatsAppMessage"); //= new WhatsAppMessage(); 
		//getBean method() of any container  return an object
		String msg = whatsAppMessage.sendMessage("Roshan");
		System.out.println(msg);
		
		ICabService iCabService = (ICabService) springContainer.getBean("olaCabService");
		System.out.println(iCabService.bookCab(" Roshan") );
		
		ICabService icabService1 = (ICabService) springContainer.getBean("uberCabService");
		System.out.println(icabService1.bookCab(" Roshan"));
		
	}
}
