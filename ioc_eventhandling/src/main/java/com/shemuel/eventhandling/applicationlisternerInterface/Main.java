package com.shemuel.eventhandling.applicationlisternerInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shemuel.i18n.spring.I18nBean;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_eventhandling.xml");
	
		 I18nBean bean =(I18nBean) ioc.getBean("i18n_bean");
		 System.out.println("\n===== WELCOME IN ENGLISH(US) =====");
		 bean.displayMessage();
		
		
	}
}
