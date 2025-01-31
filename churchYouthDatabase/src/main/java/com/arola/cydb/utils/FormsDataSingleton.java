package com.arola.cydb.utils;

import org.springframework.stereotype.Component;

import com.arola.cydb.business.Address;
import com.arola.cydb.business.Admin;
import com.arola.cydb.business.Youth;

@Component
public class FormsDataSingleton {
	
	private static FormsDataSingleton instance = new FormsDataSingleton();
	
	private Youth youth;
	private Admin admin;
	private Address address;
	
	private FormsDataSingleton() {
		// do some setup data...
	}
	
	public static FormsDataSingleton getInstance() {
		return instance;
		
	}
	
	
	
	

}
