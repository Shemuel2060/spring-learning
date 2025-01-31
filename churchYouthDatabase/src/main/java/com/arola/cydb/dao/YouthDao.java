package com.arola.cydb.dao;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arola.cydb.business.Youth;

@Repository
public class YouthDao implements IyouthDao {

	@Autowired
	public Logger logger;
	
	
	private Youth youth;
	
	@Autowired
	@Override
	public void saveYouth(Youth youth) {
		
		logger.info("Saving a youth: "+ youth);

	}

	public Youth getYouth() {
		return youth;
	}

	public void setYouth(Youth youth) {
		this.youth = youth;
	}

}
