package com.netanel.coupons.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.netanel.coupons.exceptions.IdAlreadySetException;
import com.netanel.coupons.jbeans.Company;
import com.netanel.coupons.jbeans.Coupon;

public class CompanyDBDAO implements CompanyDAO {

	@Override
	public void createCompany(Company company) {
		try {
			company.setId();
		} catch (IdAlreadySetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Connection con = DB.connectDB("Company")){
			String sqlCmdStr = "INSERT INTO Company VALUES(?,?,?,?)";
			PreparedStatement preStatement = con.prepareStatement (sqlCmdStr);
			preStatement.setLong(1, company.getId());
			preStatement.setString(2, company.getCompName());
			preStatement.setString(3, company.getPassword());
			preStatement.setString(4, company.getEmail());
			preStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeCompany(Company company) {
		try (Connection con = DB.connectDB("Company")){
			String sqlCmdStr = "DELETE FROM Company WHERE ID=?";
			PreparedStatement preStatement = con.prepareStatement (sqlCmdStr);
			preStatement.setLong(1, company.getId());
			preStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateCompany(Company company) {
		try (Connection con = DB.connectDB("Company")){
			String sqlCmdStr = "UPDATE Company SET COMP_NAME=?, PASSWORD=?, EMAIL=? WHERE ID=?";
			PreparedStatement preStatement = con.prepareStatement (sqlCmdStr);
			preStatement.setString(1, company.getCompName());
			preStatement.setString(2, company.getPassword());
			preStatement.setString(3, company.getEmail());
			preStatement.setLong(4, company.getId());
			preStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Company getCompany(long id) {
		Company company = null;
		String compName, password, email;
		try (Connection con = DB.connectDB("Company")){
			String sqlCmdStr = "SELECT * FROM Company WHERE ID=?";
			PreparedStatement preStatement = con.prepareStatement (sqlCmdStr);
			preStatement.setLong(1, id);
			ResultSet rs = preStatement.executeQuery();
			rs.next();
			compName = rs.getString("COMP_NAME");
			password = rs.getString("PASSWORD");
			email = rs.getString("EMAIL");
			
			company = new Company(id, compName, password, email);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return company;
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
