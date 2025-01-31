package com.shemuel.factoryclasses;

import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		// NORMAL WAY WITHOUT SPRING
		
				
//		CarFactory.setCarName("com.shemuel.factoryclasses.Benz");
//	
//		try {
//			Car c = CarFactory.getInstance();
//			
//			c.drive();
//			
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
//				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
//			
//			e.printStackTrace();
//		}
		
		// THE SPRING WAY
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		
		
		Logger logger = (Logger) context.getBean("logger");
		
		
		Car c2 = (Car) context.getBean("car");
		
		logger.info("\nCreated car without creating an instance of its factory\n");
		
		c2.drive();
		
		
		
		
		
		
		
		
		
		
		
	}

}
