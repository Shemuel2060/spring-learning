package com.shemuel.eventhandling.customEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("custom_event_spring_ioc.xml");
        RegistrationEventPublisher publisher = context.getBean(RegistrationEventPublisher.class);
        publisher.publishEvent("Hello, Spring Event!");
    }

}
