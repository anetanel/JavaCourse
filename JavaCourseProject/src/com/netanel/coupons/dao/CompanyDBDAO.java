package com.netanel.coupons.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.netanel.coupons.jbeans.Company;
import com.netanel.coupons.jbeans.Coupon;

public class CompanyDBDAO implements CompanyDAO {

	@Override
	public void createCompany(Company company) {
		try {
			Connection con = DB.connectDB("Company");
			PreparedStatement createCompany = con.prepareStatement ("insert into Company values(?,?,?,?)");
			createCompany.setLong(1, company.getId());
			createCompany.setString(2, company.getCompName());
			createCompany.setString(3, company.getPassword());
			createCompany.setString(4, company.getEmail());
			createCompany.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeCompany(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCompany(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public Company getCmpany(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Company> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Coupon> getCoupons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String compName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
