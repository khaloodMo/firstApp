package com.Khaled.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDBConnection {

	public static void main(String[] args) {
		PreparedStatement pst ; 
		String sql = "insert into student_demo.student (first_name , last_name, email, phone_number) values ('khaled', 'Mohamed',"
				+ "'khaled.mo.mostafa@outlook.com' , '01004000134')";
		try {
			Connection connection = DBConnection.getStudentDemoConnection();
			pst = connection.prepareStatement(sql);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
