package com.shemuel.eventhandling.customEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class RegistrationEventPublisher implements ApplicationEventPublisherAware{
	
	private ApplicationEventPublisher eventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.eventPublisher = applicationEventPublisher;
	}
	
	public void publishEvent(String message) {
		RegistrationEvent rEvent = new RegistrationEvent(null, message);
		eventPublisher.publishEvent(rEvent);
	}

}
