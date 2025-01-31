package com.shemuel.lifecyclemethods.programmaticapproach;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("lifecycle_programmatic.xml");
		
		
		TestDAO dao = (TestDAO) ioc.getBean("testDao");
		
		try {
			dao.saveStudent(3,"Azurah", "azurahkatongole@arolatech.inc", "Luwedde");
			System.out.println("Student saved successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
