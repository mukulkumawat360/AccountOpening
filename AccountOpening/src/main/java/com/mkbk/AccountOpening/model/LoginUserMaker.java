package com.mkbk.AccountOpening.model;

import java.util.Date;

public class LoginUserMaker {
	
	

	private int Srno;
	private String firstName;
	private String lastName;
	private String email;
	private Date date=new Date();
	private String password;
	
	@Override
	public String toString() {
		return "LoginUserMaker [Srno=" + Srno + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", date=" + date + ", password=" + password + "]";
	}
	public LoginUserMaker(int srno, String firstName, String lastName, String email, Date date, String password) {
		super();
		Srno = srno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.date = date;
		this.password = password;
	}
	public int getSrno() {
		return Srno;
	}
	public void setSrno(int srno) {
		Srno = srno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
