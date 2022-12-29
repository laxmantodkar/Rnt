package com.crud.operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.operation.entities.Employee;
import com.crud.operation.entities.Manager;

public interface ManagerRespository extends JpaRepository<Manager, Integer>
{
           public Manager findByName(String name);
           public Manager findById(int id);
		public Manager save(List<Employee> oldEmpList);
}
