package com.shemuel.methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankClient {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("methodreplacer.xml");

		System.out.println("\n========= ORIGINAL CALCULATE INTEREST METHOD RUN =========\n");
		Bank b = (Bank) ap.getBean("bank");

//		b.deposit();
//		b.withdraw();
		b.calcInt();

		System.out.println("\n========= REPLACED CALCULATE INTEREST METHOD RUN =========\n");

		Bank b1 = (Bank) ap.getBean("bankwithreplacedmethod");

		b1.calcInt();
	}

}
