package com.shemuel.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shemuel.autowiring.xml.models.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");

//		testAutowireByName(ap);
//		testAutowireByType(ap);
		testAutowireByConstructor(ap);

	}

	private static void testAutowireByName(ApplicationContext context) {

		Employee emp = (Employee) context.getBean("emp");

		System.out.println("============== AUTOWIRING BY NAME ==============");
		System.out.println("EMPLOYEE ADDRESS:\n" + "City: " + emp.getEmpAddress().getCity() + "\n" + "Mobile: "
				+ emp.getEmpAddress().getMobile() + "\n" + "\nAccount: " + emp.getEmpAccount().getAccountNumber() + "\n"
				+ "Balance: " + emp.getEmpAccount().getBalance());

	}

	private static void testAutowireByType(ApplicationContext context) {

		Employee emp = (Employee) context.getBean("emp");

		System.out.println("============== AUTOWIRING BY TYPE ==============");
		System.out.println("EMPLOYEE ADDRESS:\n" + "City: " + emp.getEmpAddress().getCity() + "\n" + "Mobile: "
				+ emp.getEmpAddress().getMobile() + "\n" + "\nAccount: " + emp.getEmpAccount().getAccountNumber() + "\n"
				+ "Balance: " + emp.getEmpAccount().getBalance());

	}
	
	private static void testAutowireByConstructor(ApplicationContext context) {

		Employee emp = (Employee) context.getBean("emp");

		System.out.println("============== AUTOWIRING BY CONSTRUCTOR ==============");
		System.out.println("EMPLOYEE ADDRESS:\n" + "City: " + emp.getEmpAddress().getCity() + "\n" + "Mobile: "
				+ emp.getEmpAddress().getMobile() + "\n" + "\nAccount: " + emp.getEmpAccount().getAccountNumber() + "\n"
				+ "Balance: " + emp.getEmpAccount().getBalance());

	}

}
