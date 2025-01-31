package com.arola.cydb.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arola.cydb.business.Address;
import com.arola.cydb.business.Youth;

public class SpringTest3 {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_autowiring_annotations.xml");
		
		Youth youth = (Youth) ioc.getBean("youth");
		
		System.out.println(youth);

	}

}
