package factoryimplementingfactorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CookieClient {
	
	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("factoryclasseswithFB.xml");
		
		Cookies cookie = (Cookies) ioc.getBean("cookie");
		
		cookie.cookieMessage();
	}

}
