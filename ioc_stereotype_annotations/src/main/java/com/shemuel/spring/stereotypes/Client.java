package com.shemuel.spring.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	static ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");

	public static void main(String[] args) {

//		Car c = ap.getBean("car",Car.class);
		Car c = ap.getBean(Car.class);
		
		c.printEngineName();
		
		CarServices cs = ap.getBean("carServices", CarServices.class);
		
		cs.printService();

	}

}
