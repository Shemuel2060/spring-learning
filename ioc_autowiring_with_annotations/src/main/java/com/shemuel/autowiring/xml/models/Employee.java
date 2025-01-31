package com.shemuel.autowiring.xml.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
	private Address empAddress ;
	private Account empAccount;
	
	public Employee() {System.out.println("Inside Employee default constructor");}
	
//	@Autowired
	public Employee(Address addr, Account acc) {
		this.empAddress = addr;
		this.empAccount = acc;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		System.out.println("Inside Employee address setter method");
		this.empAddress = empAddress;
	}

	public Account getEmpAccount() {
		return empAccount;
	}

	public void setEmpAccount(Account empAccount) {
		System.out.println("Inside Employee account setter method");
		this.empAccount = empAccount;
	}

	@Override
	public String toString() {
		return "Employee [empAddress=" + empAddress + ", empAccount=" + empAccount + "]";
	}
	
	

}
