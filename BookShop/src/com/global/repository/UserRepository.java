package com.global.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.global.db.DBConnection;
import com.global.to.UserTO;

public class UserRepository {
	
	
	Connection connection  = DBConnection.getConnection();
	
//	public void register(int id, String name, String email) {
//		
//		try {
//			
//			PreparedStatement statement = connection.prepareStatement("insert into user values(?, ?, ?)");
//
//			statement.setInt(1, id);
//			statement.setString(2, name);
//			statement.setString(3, email);
//
//			statement.executeUpdate();
//		}
//		catch (Exception e) {
//			System.out.println("inside regsiter of UserRepository");
//		}
//
//		
//	}
	
	
public void register(UserTO user) {
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("insert into user values(?, ?, ?)");

			statement.setInt(1, user.getId());
			statement.setString(2, user.getName());
			statement.setString(3, user.getEmail());

			statement.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("inside regsiter of UserRepository");
		}

		
	}
	
	
	public int login(int id) {
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from user where id = ?");

			statement.setInt(1, id);
			
			ResultSet resultset =  statement.executeQuery();
			
			if(resultset.next() == true) {
				return 1;
			}
			
		}
		catch(Exception e) {
			
			System.out.println("inside catch of Login of UserRepo");
		}
		
		return 0;
	}

}
