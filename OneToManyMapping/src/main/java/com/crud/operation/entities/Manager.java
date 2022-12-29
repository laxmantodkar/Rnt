package com.crud.operation.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Manager {

	public Manager(int id, String name, List<Employee> emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "manager")
	@JsonManagedReference
	private List<Employee> emp;

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

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}

}
