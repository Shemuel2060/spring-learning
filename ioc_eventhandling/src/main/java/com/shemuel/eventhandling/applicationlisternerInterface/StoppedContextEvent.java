package com.shemuel.eventhandling.applicationlisternerInterface;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StoppedContextEvent implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContext(IoC) stopped at: "+ event.getTimestamp());
		
	}

}
