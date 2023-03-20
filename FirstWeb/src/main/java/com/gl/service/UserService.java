package com.gl.service;

import java.util.List;

import com.gl.repository.UserRepository;
import com.gl.to.User;

public class UserService {
	
	UserRepository repository = new UserRepository();
	
	public void register(User user) {
		
		repository.save(user);
	}
	
	public User login (String username, String password) {
		
		return repository.find(username, password);
	}
	
	public List<User> findAll() {
		
		return repository.findAll();
	}
	
	public void delete( String username) {
		
		repository.delete(username);
	}
	
	public User findUserByUsername(String username) {
		
		return repository.findUserByUsername(username);
	}
	public void update(User user) {
		
		repository.update(user);
	}

}
