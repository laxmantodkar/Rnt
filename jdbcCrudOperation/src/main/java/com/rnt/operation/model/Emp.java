package com.rnt.operation.model;

import java.util.List;

public class Emp {

	private int id;
	private String name;
	private String designation;
	private String salary;
	private String mobileNumber;
	private String city;
	private List<Emp> emp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Emp(int id, String name, String designation, String salary, String mobileNumber, String city) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", mobileNumber=" + mobileNumber + ", city=" + city + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
