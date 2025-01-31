package com.arola.cydb.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arola.cydb.business.Address;
import com.arola.cydb.business.Youth;

public class SpringTest2 {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_autowiring_xml.xml");
		
		Address addr = (Address) ioc.getBean("address");
		Youth youth = (Youth) ioc.getBean("youth");
		
		System.out.println(addr);
		System.out.println(youth);

	}

}
