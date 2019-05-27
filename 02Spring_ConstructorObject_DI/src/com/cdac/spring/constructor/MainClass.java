package com.cdac.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext  springContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee empl = (Employee) springContext.getBean("employee");
		System.out.println(empl);

	}

}
