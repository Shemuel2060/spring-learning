package com.shemuel.spring.stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServices {
	
	@Autowired
	private Car car;
	
	
	public void printService() {
		System.out.println("Servicing "+ car.getEngine().getEngName());
	}
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

}
