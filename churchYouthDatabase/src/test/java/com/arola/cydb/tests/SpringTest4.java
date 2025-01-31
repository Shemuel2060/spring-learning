package com.arola.cydb.tests;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.arola.cydb.controllers.HelpController;
import com.arola.cydb.controllers.LoginController;

@Component
public class SpringTest4 {
	
	private static Logger logger; 


	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_stereotype_annotations.xml");
		
		logger.info("\n\n==========Testing with @Controller stereotype annotation==========\n");
		
		LoginController loginController = (LoginController) ioc.getBean("loginController");
		loginController.setUsername("shemuel");
		loginController.setPassword("pass1234word");
		loginController.login();
		
		HelpController help = (HelpController) ioc.getBean("help");
		
		help.setCounts(4);
		
		help.printCounts();
		
		
		
		logger.info("\n\n==========Testing with @Repository stereotype annotation==========\n");
		
		logger.info("\n\n==========Testing with @Service stereotype annotation==========\n");
		
		logger.info("\n\n==========Testing with @Component stereotype annotation==========\n");
		
		

	}


	public static Logger getLogger() {
		return logger;
	}


	@Autowired
	public void setLogger(Logger logger) {
		SpringTest4.logger = logger;
	}
	
	

}
