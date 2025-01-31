package model;

public class Person {
	
	String name;
	
	Person(){
		System.out.println("Inside Person constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
