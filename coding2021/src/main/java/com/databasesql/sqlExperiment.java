package com.databasesql;

import java.sql.*;

public class sqlExperiment {
	
	/* 
	 * 
	 * DECLARING VARIABLE CONSTANTS
	 * 
	 */
	
	// address link to MySQL
	static final String DB_URL = "jdbc:mysql://localhost/employee";
	
	// JDBC driver
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	static final String USER = "root";
	static final String PASSWORD = "";
	
	public static void main(String[] args) {
		
		try {
			
			// register the database driver
			Class.forName(JDBC_DRIVER);
			
			// establish connection to database
			Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			// decalring sql statement to retrieve data
			Statement statement = connection.createStatement();		
			
			// create result set
			ResultSet resultSet = statement.executeQuery("SELECT * FROM emp1");			
			
			while(resultSet.next()) {				
				// you need to have an ID at the front
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
			}		
			
			/*
			 * 
			 * CLEANING UP THE ENVIRONMENT
			 * 
			 */
			
			connection.close();
			statement.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
