package com.shemuel.autowiring.annotations.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {
	
	private Engine eng;
	
	@Autowired // uses constructor injection
	public Bus(Engine en) {
		System.out.println("Inside Bus' parameterized constructor");
		this.eng = en;
	}
	

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

}
