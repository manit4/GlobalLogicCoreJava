package com.gl.bookshop.to;

public class User {

	private String username;
	private String password;
	private String completeName;
	private String email;
	private int role;
	
	public User() {
		
	}

	public User(String username, String password, String completeName, String email, int role) {
		this.username = username;
		this.password = password;
		this.completeName = completeName;
		this.email = email;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompleteName() {
		return completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
}
