package com.Employee_Management.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Confugiration {

	private String url;
	private String username;
	private String password;
	
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
	
	public Confugiration(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Confugiration() {
		
	}
	
	public Connection connect() throws SQLException {
		
		Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
		return conn;
		
	}
}
