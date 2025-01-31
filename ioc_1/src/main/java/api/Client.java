package api;

import java.lang.reflect.Constructor;

public class Client {
	
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("model.Person");
			
			// get declared constructors
			Constructor<?> con[] = c.getDeclaredConstructors();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
