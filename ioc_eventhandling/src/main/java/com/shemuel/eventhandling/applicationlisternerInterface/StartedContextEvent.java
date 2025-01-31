package com.shemuel.eventhandling.applicationlisternerInterface;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartedContextEvent implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContext(IoC) started at: "+ event.getTimestamp());
		
	}

}
