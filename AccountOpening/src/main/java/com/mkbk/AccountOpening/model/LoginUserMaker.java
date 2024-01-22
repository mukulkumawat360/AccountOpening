package com.mkbk.AccountOpening.model;

import java.util.Date;

public class LoginUserMaker {
	
	
	@Override
	public String toString() {
		return "LoginUserMaker [Srno=" + Srno + ", firstname=" + firstname + ", lastName=" + lastName + ", EmailId="
				+ EmailId + ", date=" + date + ", password=" + password + "]";
	}
	private int Srno;
	private String firstname;
	private String lastName;
	private String EmailId;
	private Date date=new Date();
	private String password;
	
	public LoginUserMaker(int srno, String firstname, String lastName, String emailId, Date date, String password) {
		super();
		Srno = srno;
		this.firstname = firstname;
		this.lastName = lastName;
		EmailId = emailId;
		this.date = date;
		this.password = password;
	}
	public int getSrno() {
		return Srno;
	}
	public void setSrno(int srno) {
		Srno = srno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
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
