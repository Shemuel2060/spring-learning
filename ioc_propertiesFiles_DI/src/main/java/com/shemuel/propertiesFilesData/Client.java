package com.shemuel.propertiesFilesData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		ConnectionPool cp = ap.getBean("cp", ConnectionPool.class);
		
		try {
			cp.createConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
