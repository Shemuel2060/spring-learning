package com.shemuel.autowiring.xml.models;

public class Address {
	
	private String mobile;
	private String city;
	
	public Address() {System.out.println("Inside Address Constructor");}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	@Override
	public String toString() {
		return "Address [mobile=" + mobile + ", city=" + city + "]";
	}
	
	

}
