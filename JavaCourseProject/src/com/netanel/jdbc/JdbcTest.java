package com.netanel.jdbc;

import java.sql.*;

public class JdbcTest {
	public static void main(String[] args) {
		// Set Driver, URL and DB name
		String dbDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/world?user=root&password=password";
		String dbName = "world.country";
		// Load driver
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println("----------- DRIVER LOADED -----------------");
		// Create a connection using ARM.
		try (Connection con = DriverManager.getConnection(url)) {
			// Create a Statement using the connection 
			Statement stat = con.createStatement();
			// Construct an SQL query
			String sql = "SELECT * FROM " + dbName;
			// Execute the query and get the result into a Result Set
			ResultSet rs = stat.executeQuery(sql);
			// Get the Result Set Metadata
			ResultSetMetaData rsmd = rs.getMetaData();
			
			// Print column header
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				if (i > 1) {
					System.out.print (", ");
				}
				System.out.print(rsmd.getColumnLabel(i));
			}
			System.out.println();
			
			while (rs.next()) {
				// Iterate over the ResultSet 
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					if (i > 1) {
						System.out.print (", ");
					}
					// Get column type and print accordingly
					int type = rsmd.getColumnType(i);
					if (type == Types.VARCHAR || type == Types.CHAR) {
						System.out.print(rs.getString(i));
					} else {
						System.out.print(rs.getLong(i));
					}
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
