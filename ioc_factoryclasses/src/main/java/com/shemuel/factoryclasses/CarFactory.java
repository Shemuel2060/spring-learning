package com.shemuel.factoryclasses;

import java.lang.reflect.InvocationTargetException;

public class CarFactory {
	
	private static String carName; // used to pass car ref to this factory
	
	@SuppressWarnings("deprecation")
	public static Car getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Car c = (Car) Class.forName(carName).newInstance();
		
//		Car c2 = (Car) Class.forName(carName).getConstructor().newInstance();
		
		return c;
		
	}
	

	public static String getCarName() {
		return carName;
	}


	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
}
