package api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Entry;

public class Client {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		Entry entry = (Entry) ap.getBean("entry");
		Entry entry2 = (Entry) ap.getBean("entry2");
		
		System.out.println(entry.getWord() + " : " + entry.getMeaning());
		System.out.println(entry2.getWord() + " : " + entry2.getMeaning());
		
		
	}

	

}
