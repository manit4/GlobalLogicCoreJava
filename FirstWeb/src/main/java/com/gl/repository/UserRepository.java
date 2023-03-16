package com.gl.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gl.db.DBConnection;
import com.gl.to.User;

public class UserRepository {
	
	public void save(User user) {
		
		try {
			
			Connection conn = DBConnection.getConnection();
			
			PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getCompleteName());
			statement.setString(4, user.getEmail());
			
			statement.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("inside save of UserRepository");
		}
		
		
		
		
	}

}
