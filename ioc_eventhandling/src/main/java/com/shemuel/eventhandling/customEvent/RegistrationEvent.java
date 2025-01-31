package com.shemuel.eventhandling.customEvent;

import org.springframework.context.ApplicationEvent;

public class RegistrationEvent extends ApplicationEvent{
	
	private String message;

	public RegistrationEvent(Object source, String data) {
		super(source);
		// TODO Auto-generated constructor stub
		this.setMessage(data);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
