package com.shemuel.eventhandling.customEvent;

import org.springframework.context.event.EventListener;

public class RegistrationEventListener {
	
	
	
	@EventListener
	public void handleRegistrationEvent(RegistrationEvent e) {
		System.out.println("Received registration event: "+ e.getMessage());		
	}

}
