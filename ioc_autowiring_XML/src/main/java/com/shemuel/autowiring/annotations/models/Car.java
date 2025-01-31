package com.shemuel.autowiring.annotations.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
//	@Autowired // uses constructor injection
	private Engine engine;
	
	public Car() {System.out.println("Inside default Car constructor");}

	public Engine getEngine() {
		return engine;
	}

	@Autowired // uses setter injection
	public void setEngine(Engine engine) {
		System.out.println("Inside Car's engine setter");
		this.engine = engine;
	}
	
	
	public void printData() {
		System.out.println("\nEngine: "+ engine.getModelYear());
	}

}
