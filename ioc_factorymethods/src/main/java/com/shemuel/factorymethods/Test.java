package com.shemuel.factorymethods;

public class Test {
	
	private static Test t;
	
	
	protected Test() {
		System.out.println("Test Object");
	}

	
	public static Test getInstance() {
		System.out.println("Creating Test object with factory method");
		if( t == null) {
			t = new Test();
			return t;
		}else {
			return t;
		}
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Can't clone this object");
	}
}
