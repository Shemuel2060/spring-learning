package com.shemuel.lookupDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		/* ================= WITH INTERFACE ================= */
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		System.out.println(" =============== INTERFACE LOOKUP =============== ");
		
		CarInterface ci =(CarInterface) ap.getBean("c");
		
		System.out.println("PROXY IMPLEMENTATION: "+ci.getClass().getCanonicalName());
		System.out.println(ci.myCarEngine().getEngineName());
		
		
		System.out.println(" =============== ABSTRACT CLASS LOOKUP =============== ");
		
		
		// FOR A CONCRETE CLASS
		System.out.println("\n =============== ABSTRACT LOOKUP =============== ");
		CommandManager cm = (CommandManager) ap.getBean("cm");
		System.out.println(cm.getClass().getCanonicalName());
		cm.process();
		
		
		// FOR A CONCRETE CLASS
		System.out.println("\n =============== CONCRETE CLASS LOOKUP =============== ");
		Bus cc = (Bus) ap.getBean("bus");
		System.out.println(cc.getClass().getCanonicalName());
		Engine e = cc.createEngine();
		
		System.out.println(e.getEngineName());
		
				
	}

}
