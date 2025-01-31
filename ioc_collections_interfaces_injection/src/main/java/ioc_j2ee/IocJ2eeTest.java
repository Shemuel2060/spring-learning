package ioc_j2ee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;

public class IocJ2eeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		String name = (String) context.getBean("name");
		Person p = (Person) context.getBean("person");

		System.out.println(name);
		System.out.println("Name of person: "+ p.getName());
		
		

	}

}
