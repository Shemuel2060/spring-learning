package com.shemuel.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shemuel.autowiring.annotations.models.Bus;
import com.shemuel.autowiring.annotations.models.Car;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_ioc_annotations.xml");
		
		Car c = (Car) ioc.getBean("car");
		
		Bus b = (Bus) ioc.getBean("bus");
		
		System.out.println(c.getEngine().getModelYear());
		System.out.println(b.getEng().getModelYear());
		
		
	}

}
