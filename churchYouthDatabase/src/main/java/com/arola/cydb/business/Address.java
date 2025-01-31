package com.arola.cydb.business;

public class Address {
	
	private int addressID;
	private String mobileNumber;
	private String email;
	
	private Address(){}
	
	private Address(String mobileNumber, String email) throws IllegalAccessException {
		this.mobileNumber = mobileNumber;
		this.email = email;
		
		throw new IllegalAccessException("Access denied- use factory method");
	}
	
	// factory method
	
	public static Address createAddress(String mobileNumber, String email) {
		Address addr = new Address();
		
		addr.setEmail(email);
		addr.setMobileNumber(mobileNumber);
		
		return addr;
	}
	
	
	
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	

}
