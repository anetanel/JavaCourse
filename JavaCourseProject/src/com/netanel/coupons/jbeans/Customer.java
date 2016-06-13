package com.netanel.coupons.jbeans;

import java.util.HashSet;

public class Customer {
	//
	// Attributes
	//
	private long id;
	private String custName;
	private String Password;
	private HashSet<Coupon> coupons;
	
	//
	// Constructor
	//
	public Customer() {
	
	}
	
	//
	// Functions
	//
	public long getId() {
		return id;
	}

	public String getCustName() {
		return custName;
	}

	public String getPassword() {
		return Password;
	}

	public HashSet<Coupon> getCoupons() {
		return coupons;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void setCoupons(HashSet<Coupon> coupons) {
		this.coupons = coupons;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", Password=" + Password + ", coupons=" + coupons
				+ "]";
	}
	
	
}
