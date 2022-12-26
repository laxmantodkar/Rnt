package com.rnt.operation.model;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String city;
	private String course;
	private String email;
	private long mobileNumber;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	/*
	 * public Student(int id, String firstName, String lastName, String city, String
	 * course, String email, long mobileNumber, String date) { super(); this.id =
	 * id; this.firstName = firstName; this.lastName = lastName; this.city = city;
	 * this.course = course; this.email = email; this.mobileNumber = mobileNumber;
	 * this.date = date; }
	 * 
	 * @Override public String toString() { return "Student [id=" + id +
	 * ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city +
	 * ", course=" + course + ", email=" + email + ", mobileNumber=" + mobileNumber
	 * + ", date=" + date + "]"; }
	 */
	public Student() {
		super();
	}
	
	
	
	
	
}