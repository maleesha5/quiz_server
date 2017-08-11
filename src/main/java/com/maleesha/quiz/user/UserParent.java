package com.maleesha.quiz.user;

import java.util.Arrays;

import org.springframework.data.annotation.Id;

public class UserParent {

	@Id
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String role;
	
	private String password;
	
	private String[] authorities;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String[] getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String[] authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "UserParent [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", role=" + role + ", password=" + password + ", authorities=" + Arrays.toString(authorities)
				+ "]";
	}

}
