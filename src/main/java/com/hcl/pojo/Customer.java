package com.hcl.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private String customerId;
	private String name;
	private String phone;
	private String mailId;

	public Customer(){}
	
	public Customer(String customerId, String name, String phone, String mailId ){
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.mailId =  mailId;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
}
