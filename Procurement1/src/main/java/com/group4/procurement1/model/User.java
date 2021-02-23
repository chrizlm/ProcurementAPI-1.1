package com.group4.procurement1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String email;
	private String password;
	
	
	public int getUserId() {return userId;}
	
	public void setUserId(int userId) {this.userId = userId;}
	
	public String getFirstName() {return firstName;}	
	
	public void setFirstName(String firstName) {this.firstName = firstName;}	
	
	public String getLastName() {return lastName;}
	
	public void setLastName(String lastName) {this.lastName = lastName;}
	
	public int getPhoneNumber() {return phoneNumber;}
	
	public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
	
	public String getEmail() {return email;}
	
	public void setEmail(String email) {this.email = email;}
	
	public String getPassword() {return password;}
	
	public void setPassword(String password) {this.password = password;}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
