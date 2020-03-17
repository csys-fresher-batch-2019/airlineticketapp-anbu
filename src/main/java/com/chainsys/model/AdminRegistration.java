package com.chainsys.model;

public class AdminRegistration {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailId;
	}
	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	private String emailId;
	private String password;
	private long contact;
}
