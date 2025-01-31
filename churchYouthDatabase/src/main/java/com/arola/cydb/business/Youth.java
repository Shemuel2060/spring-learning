package com.arola.cydb.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Youth {
	
	private Long youthID;
	private String firstName;
	private String lastName;
	
	@Autowired
	@Qualifier("address1") // give a specific bean id to auto inject into this
	private Address address;
	
	private Youth(String fName, String lName){
		System.out.println("Constructing Youth object");
		this.firstName = fName;
		this.lastName = lName;
	}
	
	
	
	public Long getYouthID() {
		return youthID;
	}
	public void setYouthID(Long youthID) {
		this.youthID = youthID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Youth [youthID=" + youthID + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
	
	



	
	
	
	
	
	

}
