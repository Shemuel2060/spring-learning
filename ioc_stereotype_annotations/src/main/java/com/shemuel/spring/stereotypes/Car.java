package com.shemuel.spring.stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.inject.Named;

 @Component // @Named - does not work...?? 
public class Car {
	
	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printEngineName() {
		System.out.println("Engine Name: "+ engine.getEngName());
	}

}
