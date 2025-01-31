package com.shemuel.autowiring.xml.models;

public class Employee {
	
	private Address empAddress ;
	
	private Account empAccount;

	public Employee() {System.out.println("Inside Employee Default Constructor");}
	
	
	public Employee(Address eaddr, Account eacct) {
		System.out.println("Inside Employee parameterized Constructor");
		this.empAccount = eacct;
		this.empAddress = eaddr;
	}
	
	public Address getEmpAddress() {
		return empAddress;
	}
	
	public void printData() {
		System.out.println("\nAddress: "+ empAddress + "\n"
				+ "Account: "+ empAccount +"\n");
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
