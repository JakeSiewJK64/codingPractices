package com.databasesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class deletingRecords {
	
	public static final String DB_DRIVER = new String("com.mysql.jdbc.Driver");
	public static final String DB_CONNECTION = new String("jdbc:mysql://localhost/employee");
	
	public static final String USER = new String("root");
	public static final String PASSWORD = new String("");
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// loading class	
		System.out.println(Class.forName(DB_DRIVER));
		
		Connection connection = DriverManager.getConnection(DB_CONNECTION, USER, PASSWORD);
		
		Statement statement = (Statement) connection.createStatement();
		
		int result = statement.executeUpdate("DELETE FROM emp1 WHERE id=100");
		System.out.println(result + " records affected");
		connection.close();
	}
}
