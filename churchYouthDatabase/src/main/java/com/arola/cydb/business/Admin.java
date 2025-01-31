package com.arola.cydb.business;

public class Admin {
	
	private int adminID;
	private Youth youth;
	private String loginName;
	private String password;
	
	
	private Admin() {}
	
	
	private Admin(Youth youth, String username, String password) throws IllegalAccessException {
		System.out.println("Inside private constructor");
		this.youth = youth;
		this.loginName = username;
		this.password = password;
		throw new IllegalAccessException("Restricted from private methods");
		
	}
	
	// factory methods
	
	public static Admin createAdmin() {
		System.out.println("Factory method with no-arg constructor");
		return new Admin();
	}
	
	public static Admin createAdmin(Youth y, String username, String pass) {
		System.out.println("Factory method with args constructor");
		Admin admin = new Admin();
		
		admin.setAdminID(1);
		admin.setLoginName(username);
		admin.setPassword(pass);
		admin.setYouth(y);		
		
		return admin;
	}
	
	
	
	
	
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		System.out.println("Setting admin id");
		this.adminID = adminID;
	}
	public Youth getYouth() {
		return youth;
	}
	public void setYouth(Youth youth) {
		System.out.println("Setting youth that is an admin");
		this.youth = youth;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		System.out.println("Setting admin login name");
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("Setting admin password");
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", youth=" + youth + ", loginName=" + loginName + ", password=" + password
				+ "]";
	}
	
	

}
