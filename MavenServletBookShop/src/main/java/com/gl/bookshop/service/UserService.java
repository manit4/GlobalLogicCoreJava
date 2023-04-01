package com.gl.bookshop.service;

import java.util.List;

import com.gl.bookshop.repository.UserRepository;
import com.gl.bookshop.to.User;

public class UserService {
	
	UserRepository repository = new UserRepository();
	
	public void register(User user) {
		
		
		
		repository.addUser(user);
	}
	
	public User login(String username, String password) {
		
		return repository.findUser(username, password);
	}
	
	public List<User> getAllUsers() {
		
		return repository.findAll();
	}
	
	

}
