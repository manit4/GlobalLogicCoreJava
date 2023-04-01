package com.global;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLDataInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl_first", "root", "root");

		PreparedStatement statement = connection.prepareStatement("insert into student1 values(?, ?)");
		
		int counter = 1;
		
		for(int i = 1; i <= 100000; i++ ) {
			
			if(i % 1000 == 0) {
				
				counter++;
			}
			
			statement.setInt(1, i);
			statement.setString(2, "Himanshu"+counter);
			statement.executeUpdate();
		}
		
		
	}

}
