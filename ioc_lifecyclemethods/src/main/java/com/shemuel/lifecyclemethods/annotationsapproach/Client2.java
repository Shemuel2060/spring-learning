package com.shemuel.lifecyclemethods.annotationsapproach;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
	
	static String code, name, field;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("lifecyclemethods_annotationapproach.xml");
		TestDao2 dao = (TestDao2) ioc.getBean("testDao");
		
//		dao.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add subject; 2 to exit");
		while(true) {
			
			String choice = sc.next();
			if(choice.equals("1")) {
				System.out.println("Enter subject code: ");
				code = sc.next();
				System.out.println("Enter subject name: ");
				name = sc.next();
				System.out.println("Enter subject field: ");
				field = sc.next();
				
				
				
				try {
					dao.saveSubject(code, name, field);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Enter 1 to add subject; 2 to exit");
				
				
			}else { // chosen 2 or something else
				
//				dao.stop(); // close the connection
				break; // end loop
			}
			
			
		}
		
		// close scanner
		sc.close();
		
		
	}

}
