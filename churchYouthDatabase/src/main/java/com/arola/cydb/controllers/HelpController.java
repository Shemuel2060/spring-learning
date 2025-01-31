package com.arola.cydb.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="help")
public class HelpController {
	
	private static Logger logger;
	
	private int counts;
	

	public static Logger getLogger() {
		logger.info("Serving logger");
		return logger;
	}

	@Autowired
	public void setLogger(Logger logger) {
		HelpController.logger = logger;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	} 
	
	
	public void printCounts() {
		logger.info("\n\nCOUNTS: "+counts+"\n");
	}

}
