package com.app.domain;

import java.util.Set;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;

@Entity
@Table(name="user_table")
public class User {
	@Id
	@Column(name="user_id")
	private int uId;
	@Column(name="first_name")
	private String firstname;
	@OneToMany(targetEntity = PhoneNumber.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="uid",referencedColumnName="user_id")
	@Fetch(FetchMode.JOIN)
	private Set<PhoneNumber> phones;
	public User(int uId, String firstname) {
		
		this.uId = uId;
		this.firstname = firstname;
	}
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Set<PhoneNumber> getPhones() {
		return phones;
	}
	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", firstname=" + firstname + "]";
	}
	
	
	
	
}
