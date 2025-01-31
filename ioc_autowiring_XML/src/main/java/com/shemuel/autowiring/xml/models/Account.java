package com.shemuel.autowiring.xml.models;

public class Account {
	
	private String accountNumber;
	private double balance;
	
	public Account() {System.out.println("Inside Account Constructor");}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	
}
