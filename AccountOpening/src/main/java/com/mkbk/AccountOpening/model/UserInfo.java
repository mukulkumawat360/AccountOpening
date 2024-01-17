package com.mkbk.AccountOpening.model;

public class UserInfo {

	private int serialnum;
	private String firsatName;
	private String secondName;
	private String typeOfCustomer;
	private String status;
	

	public UserInfo(int serialnum, String firsatName, String secondName, String typeOfCustomer, String status) {
		super();
		this.serialnum = serialnum;
		this.firsatName = firsatName;
		this.secondName = secondName;
		this.typeOfCustomer = typeOfCustomer;
		this.status = status;
	}
	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	public String getFirsatName() {
		return firsatName;
	}
	public void setFirsatName(String firsatName) {
		this.firsatName = firsatName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getTypeOfCustomer() {
		return typeOfCustomer;
	}
	public void setTypeOfCustomer(String typeOfCustomer) {
		this.typeOfCustomer = typeOfCustomer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
