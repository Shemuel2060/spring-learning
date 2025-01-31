package com.shemuel.eventhandling.applicationlisternerInterface;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RefreshedContextEvent implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContext (IoC) refreshed at: "+ event.getTimestamp());
		
	}

}
