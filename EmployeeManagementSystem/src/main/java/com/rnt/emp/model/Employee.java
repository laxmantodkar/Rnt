package com.rnt.emp.model;

import java.util.Random;

public class Employee 
{
	private int id;
	private String name;
	private String designation;
	private int salary;
	private long mobileNumber;
	private String city;
	public Employee(int id, String name, String designation, int salary, long mobileNumber, String city) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.city = city;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int i) {
		this.salary = i;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", mobileNumber=" + mobileNumber + ", city=" + city + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		

}
