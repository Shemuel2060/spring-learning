package com.shemuel.jdk_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdkAnnotationClient {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("jdk_autowiring_annotations_ioc.xml");
		
		
		Car c = (Car) ap.getBean("c");
		
		c.printEngine();
	}

}
