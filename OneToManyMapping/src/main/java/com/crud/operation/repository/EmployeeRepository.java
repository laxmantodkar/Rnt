package com.crud.operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.operation.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findById(int id);

	public Employee save(List<Employee> oldEmpList);
}
