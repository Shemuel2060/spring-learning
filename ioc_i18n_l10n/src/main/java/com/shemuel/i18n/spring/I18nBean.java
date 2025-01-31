package com.shemuel.i18n.spring;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18nBean {
	
	
	private MessageSource messageSource;
	
	public void displayMessage() {
//		Locale l1 = Locale.US; // Locale l1 = new Locale("en", "UK");
		System.out.println("Message: "+ messageSource.getMessage("welcome", null, Locale.US));
		
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
	