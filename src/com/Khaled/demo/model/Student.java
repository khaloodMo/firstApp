package com.Khaled.demo.model;

public class Student {
	private String firstName;
	private String lastName; 
	private int id ;
	private String email ;
	private int phoneNumber ;
	
	public Student() {
	}

	public Student(String firstName, String lastName, String email, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



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



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	

}
