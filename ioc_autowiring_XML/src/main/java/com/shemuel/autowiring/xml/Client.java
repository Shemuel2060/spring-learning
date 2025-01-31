package com.shemuel.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shemuel.autowiring.xml.models.Employee;

public class Client {

	public static void main(String[] args) {
//		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc_byType.xml");
		
//		ApplicationContext ap1 = new ClassPathXmlApplicationContext("spring_ioc_byName.xml");
		
//		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc_byConstructor.xml");
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc_default.xml");
		
		Employee emp = (Employee) ap.getBean("emp");
		
		emp.printData();
		
		


	}

	

}
