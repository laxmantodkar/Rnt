package com.crud.operation.entities;

public class EmployeeDto
{
	private int id;
	private String name;
	private Manager manager;
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
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}
	public EmployeeDto(int id, String name, Manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
