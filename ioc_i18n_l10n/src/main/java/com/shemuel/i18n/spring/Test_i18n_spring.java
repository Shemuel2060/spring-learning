package com.shemuel.i18n.spring;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_i18n_spring {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("ioc_i18n_spring.xml");
		
		
		 I18nBean bean =(I18nBean) ap.getBean("i18n_bean");
		 System.out.println("\n===== WELCOME IN ENGLISH(US) =====");
		 bean.displayMessage();
		 
		
		// ALTERNATIVE APPROACH
		 System.out.println("\n===== WELCOME IN LUGANDA =====");
		noMessageSourceDependency(ap);
	}
	
	public static void noMessageSourceDependency(ApplicationContext ap) {
		
		MessageSource ms = (MessageSource) ap.getBean("messageSource");
		
		System.out.println("Message: "+ms.getMessage("welcome", null, Locale.US));
		
	}

}
