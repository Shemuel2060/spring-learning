package com.arola.cydb.controllers;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	
	
//	@Autowired // does not work on static fields... 
	private static Logger logger;
	
	private String username;
	private String password;
	
	public void login() {
		
		logger.info("\n\nLogging in as "+ username +" with password: "+ password+"\n");
		
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public static Logger getLogger() {
		return logger;
	}


	@Autowired // but works on static methods... 
	public void setLogger(Logger logger) {
		LoginController.logger = logger;
	}


	
	
	

}
