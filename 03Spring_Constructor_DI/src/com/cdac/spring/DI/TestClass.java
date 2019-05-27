package com.cdac.spring.DI;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.Resource;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext r = new ClassPathXmlApplicationContext("bean.xml");
		//BeanFactory factory = new XmlBeanFactory(r);
		Employee empl = (Employee) r.getBean("e");
		System.out.println(empl);

	}

}
