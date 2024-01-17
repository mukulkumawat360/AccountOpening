package com.mkbk.AccountOpening.model;

public class LoginCredentials {

	private int sero;
	private String username;
	private String password;
	
	

	public LoginCredentials(int sero, String username, String password) {
		super();
		this.sero = sero;
		this.username = username;
		this.password = password;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
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
