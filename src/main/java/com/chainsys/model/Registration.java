package com.chainsys.model;

public class Registration {
	private String name;
	private String emailId;
	private String password;
	private long contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public String setEmailId(String emailId) {
		return this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public String setPassword(String password) {
		return this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
}
