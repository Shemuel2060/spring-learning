package com.shemuel.eventhandling.applicationlisternerInterface;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ClosedContextEvent implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContext(IoC) closed at: "+ event.getTimestamp());
		
	}

}
