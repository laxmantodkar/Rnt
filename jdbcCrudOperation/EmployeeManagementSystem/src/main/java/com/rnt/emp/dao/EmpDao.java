package com.rnt.emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rnt.emp.model.Employee;

@Repository
public class EmpDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Insert
	public int saveEmp(Employee emp) {
		
			String q = "insert into emp(name,designation,salary,mobileNumber,city) values(?,?,?,?,?)";
			int i = jdbcTemplate.update(q, emp.getName(), emp.getDesignation(), emp.getSalary(), emp.getMobileNumber(),
					emp.getCity());
			return i;
	}

	// Get All Employee
	public List<Employee> getEmp() {

		String q = "select * from emp order by name";
		List<Employee> emp = jdbcTemplate.query(q, new RowMapping());

		return emp;
	}

	// Geting single emp data
	public Employee getSingleEmp(int empId) {
		String q = "select * from emp where id=?";

		Employee emp = jdbcTemplate.queryForObject(q, new RowMapping(), empId);

		return emp;
	}

	// Delete Emp
	public int deleteEmp(int empId) {
		String q = "delete from emp where id=?";
		int i = jdbcTemplate.update(q, empId);
		return i;

	}

	// Update Emp
	public int updateEmp(Employee emp) {

		String q = "update emp set name=?,designation=?,salary=?,mobileNumber=?,city=? where id=?";
		
		int i = jdbcTemplate.update(q, emp.getName(), emp.getDesignation(), emp.getSalary(), emp.getMobileNumber(),
				emp.getCity(), emp.getId());

		return i;

	}

	// search

	public List<Employee> searchEmp(String name) {
		String q = "select * from emp where name like ?";
		List<Employee> empName = jdbcTemplate.query(q, new RowMapping(), "%" + name + "%");

		return empName;

	}

}
