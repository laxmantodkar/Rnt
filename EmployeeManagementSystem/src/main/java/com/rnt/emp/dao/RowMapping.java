package com.rnt.emp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rnt.emp.model.Employee;

public class RowMapping implements RowMapper<Employee>
{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setDesignation(rs.getString(3));
		//System.out.println(rs.getString(3));
		emp.setSalary(rs.getInt(4));
		emp.setMobileNumber(rs.getLong(5));
		emp.setCity(rs.getString(6));
		return emp;
	}

}
