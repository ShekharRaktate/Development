package com.app.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Phone_Numbers")
public class PhoneNumber {
	@Id
	private long phone;
	@Column(name="number_type")
	private String number_type;
	public PhoneNumber() {
		System.out.println("PhoneNumber:- one prameter");
	}
	public PhoneNumber(long phone,String number_type) {
		this.phone=phone;
		this.number_type=number_type;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getNumber_type() {
		return number_type;
	}
	public void setNumber_type(String number_type) {
		this.number_type = number_type;
	}
	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", number_type=" + number_type + "]";
	}
	
}