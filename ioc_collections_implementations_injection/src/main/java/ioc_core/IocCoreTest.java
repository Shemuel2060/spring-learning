package ioc_core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class IocCoreTest {
	
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("spring_ioc.xml");
//		System.out.println("Created resource: "+ resource);
		
//		BeanFactory factory = new XmlBeanFactory(resource);
//		System.out.println("Created bean factory: "+ factory);
		
		
//		String str = (String) factory.getBean("name");
//		
//		if(str.isBlank()) System.out.println(str + " is blank");
//		
//		System.out.println(str);
		
		
	}
	
	

}
