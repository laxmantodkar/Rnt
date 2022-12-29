package com.crud.operation.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
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
		return "Employee [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}

	public Employee(int id, String name, Manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
