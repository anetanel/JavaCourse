package com.netanel.coupons.jbeans;

import java.util.HashSet;

public class Company {
	//
	// Attributes
	//
	private static long idCount = 1;
	private long id;
	private String compName;
	private String password;
	private String email;
	private HashSet<Coupon> coupons;
	
	
	//
	// Constructor
	//
	public Company(String compName, String password, String email) {
		this.compName = compName;
		this.password = password;
		this.email = email;
		this.id = idCount++;
	}

	//
	// Functions
	//
	public long getId() {
		return id;
	}

	public String getCompName() {
		return compName;
	}

	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}


	public HashSet<Coupon> getCoupons() {
		return coupons;
	}

	public void setId(long id) {
		this.id = id;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	public void setCoupons(HashSet<Coupon> coupons) {
		this.coupons = coupons;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", compName=" + compName + ", Password=" + password + ", email=" + email
				+ ", coupons=" + coupons + "]";
	}
	
	
}
