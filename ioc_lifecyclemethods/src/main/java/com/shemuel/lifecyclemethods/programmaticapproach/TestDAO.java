package com.shemuel.lifecyclemethods.programmaticapproach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestDAO implements InitializingBean, DisposableBean {

	
	// db requirements
	
	private String url,username,pwd,driver;
	
	private Connection con;

	@Override
	public void afterPropertiesSet() throws Exception { // the init()
		// TODO initialization logic
		
		Class.forName(driver); // purpose not clear...
		
		con = DriverManager.getConnection(url,username,pwd);
		System.out.println("Connection created");
		
	}
	
	// service method to save user
	public void saveStudent(int id, String name, String email, String address) throws SQLException {
		// created prepared statement
		PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
		
		// set properties
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		
		// execute the ps
		ps.executeUpdate();
		
		System.out.println("Insertion into DB succeeded");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Clearing and closing logic 
		con.close();
		
	}
	
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	

	

}
