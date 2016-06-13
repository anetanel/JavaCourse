package com.netanel.coupons.dao;

import java.util.*;

import com.netanel.coupons.jbeans.*;

public interface CompanyDAO {
	public void createCompany(Company company);
	
	public void removeCompany(Company company);
	
	public void updateCompany(Company company);
	
	public Company getCmpany(long id);
	
	public Set<Company> getAllCompanies();
	
	public Set<Coupon> getCoupons();
	
	public boolean login(String compName, String password);
	
}
