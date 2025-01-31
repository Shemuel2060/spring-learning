package api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Entry;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		Entry entry = (Entry) ap.getBean("entry");
		
		System.out.println(entry.getWord() + " : " + entry.getMeaning());
		
		System.out.println("SYNONYM: "+ entry.getSynonym().getWord());
		
	}

}
