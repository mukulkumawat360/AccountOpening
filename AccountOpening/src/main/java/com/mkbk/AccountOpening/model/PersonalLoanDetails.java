package com.mkbk.AccountOpening.model;

import java.util.Date;

public class PersonalLoanDetails {

	private String panNo;
	private String mobNo;
	private String nameOnDoc;
	private boolean cibilConsent;
	private Date dob;
	private String emailId;
	

	public PersonalLoanDetails(String panNo, String mobNo, String nameOnDoc, boolean cibilConsent, Date dob,
			String emailId) {
		super();
		this.panNo = panNo;
		this.mobNo = mobNo;
		this.nameOnDoc = nameOnDoc;
		this.cibilConsent = cibilConsent;
		this.dob = dob;
		this.emailId = emailId;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getNameOnDoc() {
		return nameOnDoc;
	}
	public void setNameOnDoc(String nameOnDoc) {
		this.nameOnDoc = nameOnDoc;
	}
	public boolean isCibilConsent() {
		return cibilConsent;
	}
	public void setCibilConsent(boolean cibilConsent) {
		this.cibilConsent = cibilConsent;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "PersonalLoanDetails [panNo=" + panNo + ", mobNo=" + mobNo + ", nameOnDoc=" + nameOnDoc
				+ ", cibilConsent=" + cibilConsent + "]";
	} 
	
	
	
}
