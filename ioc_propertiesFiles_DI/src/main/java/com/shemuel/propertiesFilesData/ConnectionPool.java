package com.shemuel.propertiesFilesData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
	
	
	
	private String driver, url, username, password;
	
	public void createConnection() throws ClassNotFoundException {
		try {
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connected to schema: "+ con.getSchema());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

}
