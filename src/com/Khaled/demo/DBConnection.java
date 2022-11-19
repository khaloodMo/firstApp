package com.Khaled.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getStudentDemoConnection() {
		Connection connection ;
		String user = "khaled";
		String pass = "khaled";
		String JdbcUrl = "jdbc:mysql://localhost:3306/student_demo?";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			 connection = DriverManager.getConnection(JdbcUrl,user,pass);
			return connection;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
	
	

}
