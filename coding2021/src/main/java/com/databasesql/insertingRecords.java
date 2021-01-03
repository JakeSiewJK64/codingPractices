package com.databasesql;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class insertingRecords {
	
	// declaring constants
	public static final String DB_DRIVER = new String("com.mysql.jdbc.Driver");
	
	// declaring the address of database
	public static final String DB_CONNECTON = new String("jdbc:mysql://localhost/employee");
	
	// declaring the credentials
	public static final String USER = new String("root");
	public static final String PASSWORD = new String("");
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// loading the library
		Class.forName(DB_DRIVER);
		
		// get connection
		Connection connection = (Connection) DriverManager.getConnection(DB_CONNECTON, USER, PASSWORD);
		
		Statement statement = (Statement) connection.createStatement();
		
		String query = new String("INSERT INTO emp1 VALUES (400, 12, 'Jak', 'Siw')");
		int result = statement.executeUpdate(query);
		
		System.out.println(result + " records affected");
		connection.close();
	}
}
