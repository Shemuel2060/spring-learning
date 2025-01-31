package com.shemuel.factorymethods;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		Test t1 = (Test)context.getBean("t");
		Test t2 = (Test)context.getBean("t");
		
		System.out.println(t1==t2);
		
		/* Calendar class - not instantiable directly except through a static factory method*/
		
		Calendar c1 = (Calendar)context.getBean("c");
		Calendar c2 = (Calendar)context.getBean("c");
		
		System.out.println(c1==c2);
		
		
		
		
		
	}

}
