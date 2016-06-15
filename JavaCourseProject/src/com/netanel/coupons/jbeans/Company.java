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
	public Company() { }
	
	public Company(String compName, String password, String email) {
		this.compName = compName;
		this.password = password;
		this.email = email;
	}
	
	public Company(long newId, String compName, String password, String email) {
		this(compName, password, email);
		try {
			setId(newId);
		} catch (IdAlreadySetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compName == null) ? 0 : compName.hashCode());
		result = prime * result + ((coupons == null) ? 0 : coupons.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Company other = (Company) obj;
		if (compName == null) {
			if (other.compName != null) {
				return false;
			}
		} else if (!compName.equals(other.compName)) {
			return false;
		}
		if (coupons == null) {
			if (other.coupons != null) {
				return false;
			}
		} else if (!coupons.equals(other.coupons)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		return true;
	}
	
	
}
