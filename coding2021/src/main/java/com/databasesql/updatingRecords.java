package com.databasesql;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class updatingRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// loading in the class
		Class.forName("com.mysql.jdbc.Driver");
		
		// establishing the connection to the database
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
		
		// creating the statement variable
		Statement statement = (Statement) connection.createStatement();
		
		String query = "UPDATE emp1 SET first = 'Holley', last = 'genius', age = 15 WHERE ID = 100";
		
		int result = statement.executeUpdate(query);
		
		System.out.println(result + " records affected.");
		
		
		
	}
}
