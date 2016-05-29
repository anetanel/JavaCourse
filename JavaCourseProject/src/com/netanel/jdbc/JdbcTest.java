package com.netanel.jdbc;

import java.sql.*;

public class JdbcTest {
	public static void main(String[] args) {
		String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		try {
			Class.forName(dbClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("----------- DRIVER LOADED -----------------");
		
		String url = "jdbc:sqlserver://localhost:1433;" +
				   "databaseName=Northwind;integratedSecurity=true;";
		try {
			Connection con = DriverManager.getConnection(url);
			Statement stat = con.createStatement();
			String sql = "SELECT * FROM [Northwind].[dbo].[Orders]";
			
			// 5. execute the command on the statement
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				//System.out.println(rs.getString(4));
				//System.out.println(rs.getInt("Population"));
				System.out.println("*******************************");
			}
			
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
	}
}
