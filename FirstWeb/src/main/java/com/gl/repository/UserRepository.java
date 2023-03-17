package com.gl.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gl.db.DBConnection;
import com.gl.to.User;

public class UserRepository {
	
	Connection conn = DBConnection.getConnection();

	public void save(User user) {

		try {

			PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getCompleteName());
			statement.setString(4, user.getEmail());

			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("inside save of UserRepository");
		}

	}

	public User find(String username, String password) {
		
		User user = null;
		
		try {
			
			PreparedStatement statement = conn.prepareStatement("select * from user where username = ? and password = ?");
			statement.setString(1, username);
			statement.setString(2, password);
			
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				
				String name = resultSet.getString(3);
				String email = resultSet.getString(4);
				
				user = new User(username, password, name, email);
			}
		}
		catch (Exception e) {
			System.out.println("inside catch of find() of UserRepository");
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User> findAll() {
		
		List<User> users = new ArrayList<User>();
		
		try {
			
			PreparedStatement statement =  conn.prepareStatement("select * from user");
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				String username = resultSet.getString(1);
				String password = resultSet.getString(2);
				String name = resultSet.getString(3);
				String email = resultSet.getString(4);
					
				User user = new User(username, password, name, email);
				users.add(user);
				
			}
			
		}
		catch (Exception e) {
			System.out.println("inside catch of findAll of UserRepository");
			e.printStackTrace();
		}
		
		return users;
	}

}
