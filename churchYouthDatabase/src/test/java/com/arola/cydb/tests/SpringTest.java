package com.arola.cydb.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arola.cydb.business.Admin;
import com.arola.cydb.business.Youth;

public class SpringTest {
	
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
		
//		Youth youth = (Youth) ioc.getBean("youth");
		Admin admin = (Admin) ioc.getBean("admin");
		
		Youth youth = admin.getYouth();
		
		System.out.println(youth);
		System.out.println(admin);
		
		
		
		
		
		
	}
	
	

}
