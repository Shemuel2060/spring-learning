package com.shemuel.lookupDI;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {
	
	@Autowired
	private Engine e;
	
	public Engine createEngine() {
		
		e.setEngineName("Bus Engine");
		
		return e;
	}

}
