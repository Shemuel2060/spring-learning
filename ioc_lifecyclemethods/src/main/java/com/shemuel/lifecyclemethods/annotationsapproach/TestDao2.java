package com.shemuel.lifecyclemethods.annotationsapproach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class TestDao2 //implements SmartLifecycle //, SmartInitializingSingleton 
{

	private String url, username, pwd, driver; // connection requirements
	private Connection con;

	/*
	 * https://docs.spring.io/spring-framework/reference/core/beans/annotation-
	 * config/postconstruct-and-predestroy-annotations.html#page-title
	 */

	// https://docs.spring.io/spring-framework/reference/core/beans/factory-nature.html#beans-factory-lifecycle-combined-effects

	public TestDao2() {
		System.out.println("DAO instantiated by Spring");
	}
	
	/* ==================== START OF INITIALIZATION LIFECYCLE APPROACHES: ==================== */
	
	/* ==================== APPROACH 1: NOT RECOMMENDED FOR HEAVY INITIALIZATION TASKS ==================== */
	
	
	@PostConstruct
	/* needs the CommonAnnotationsBeanPostProcessor bean which needs the javax.annotation.resource dependency*/
	public void initialization() throws SQLException, ClassNotFoundException {
	    System.out.println("Driver: " + driver);

	    Class.forName(driver);
	    con = DriverManager.getConnection(url, username, pwd);
	    System.out.println("Connection obtained to schema: " + con.getSchema());
	}
	
	/* ==================== APPROACH 2: ==================== */

//	@EventListener(ContextRefreshedEvent.class) // used instead of @PostConstruct to avoid initialization deadlocks
//	/* Ensures all beans are fully initialized before running the database setup.
//	   Avoids blocking the application startup due to long-running operations.*/
//	public void initialization() throws SQLException, ClassNotFoundException {
//	    System.out.println("Driver: " + driver);
//
//	    Class.forName(driver);
//	    con = DriverManager.getConnection(url, username, pwd);
//	    System.out.println("Connection obtained to schema: " + con.getSchema());
//	}

	/* ==================== APPROACH 3: ==================== */
	
//	@Override
//	public void afterSingletonsInstantiated() {
//		/* Runs after all beans of singleton scope have been instantiated but:
//		 * 	1. before application starts processing requests
//		 * 	2.  still within spring's startup sequence */
//
//		System.out.println("Driver: " + driver);
//
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, username, pwd);
//			System.out.println("Connection obtained to schema: " + con.getSchema());
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//
//	}
	
	/* ==================== APPROACH 4: ==================== */
	
	/* - If your bean should start/stop automatically with the Spring context.
	   - If it needs to perform clean-up before shutdown */
	
//	private boolean running = false;
	
//	@Override
//	public void start() {
//		System.out.println("Driver: " + driver);
//
//		if(running) {
//			stop();
//		}
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, username, pwd);
//			System.out.println("Connection obtained to schema: " + con.getSchema());
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		running = true;
//		
//	}

//	@Override
//	public void stop() {
//		// TODO Auto-generated method stub
//		System.out.println("Shutting down database connection");
//		try {
//			con.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		running = false;
//		
//	}
//
//	@Override
//	public boolean isRunning() {
//		// TODO Auto-generated method stub
//		return running;
//	}
	
	
	/* ==================== END OF INITIALIZATION LIFECYCLE APPROACHES : ==================== */
	
	
	

	public void saveSubject(String code, String name, String field) throws SQLException {
		// create prepared statement
		if (con != null) {
			PreparedStatement ps = con.prepareStatement("insert into subjects values(?,?,?)");

			ps.setString(1, code);
			ps.setString(2, name);
			ps.setString(3, field);

			ps.executeUpdate();

			System.out.println("\nSuccessfully persisted a subject\n");
		} else {
			System.out.println("Connection failures");
		}

	}
	
	/* ==================== START OF DESTROY APPROACHES: ==================== */
	

	@PreDestroy // clean up
	public void myDestroy() {

	}

	public void setUrl(String url) {
		System.out.println("Setter injection of the url: " + url);
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	

}
