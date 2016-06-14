package com.netanel.coupons.jbeans;

import java.util.HashSet;

import com.netanel.coupons.exceptions.IdAlreadySetException;

public class Company {
	//
	// Attributes
	//
	private static long idCount = 1;
	private long id=-1;
	private String compName;
	private String password;
	private String email;
	private HashSet<Coupon> coupons;
	
	
	//
	// Constructors
	//
	public Company(String compName, String password, String email) {
		this.compName = compName;
		this.password = password;
		this.email = email;
	}
	
	public Company(long newId, String compName, String password, String email) {
		try {
			setId(newId);
		} catch (IdAlreadySetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.compName = compName;
		this.password = password;
		this.email = email;
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

	public void setId() throws IdAlreadySetException{
		if (id == -1) {
			id = idCount++;
		} else {
			throw new IllegalArgumentException("Only new IDs (-1) are allowed to be changed");
		}
	}
	
	private void setId(long newId) throws IdAlreadySetException{
		if (id == -1) {
			id = newId;
		} else {
			throw new IllegalArgumentException("Only new IDs (-1) are allowed to be changed");
		}
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
