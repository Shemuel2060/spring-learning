package com.shemuel.methodreplacer;

public class Bank {
	
	public void deposit() {
		System.out.println("Deposit method");
	}
	
	public void withdraw() {
		System.out.println("Withdraw method");
	}
	
	public void calcInt() {
		System.out.println("Original Calculate Interest method");
	}
	/* 
	 * Change implementations of any of these methods without necessarily
	 * recreating them via class extensions and direct method overrides...
	 * */

}
