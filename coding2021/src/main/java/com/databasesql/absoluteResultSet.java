package com.databasesql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class absoluteResultSet {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// loading the library
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
		
		Statement statement = (Statement) connection.createStatement();
		
		String query = "SELECT * FROM emp1";
		
		ResultSet resultset = statement.executeQuery(query);
		
		int size = 3;
		resultset.absolute(size);		
		
		for(int i = 1; i < size; i++) {
			System.out.print(resultset.getString(i) + " ");
		}
		
	
		
	}
}
