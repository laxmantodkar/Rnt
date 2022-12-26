package com.rnt.emp.service;

import java.util.List;

import org.apache.catalina.LifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnt.emp.dao.EmpDao;
import com.rnt.emp.model.Employee;

@Service
public class EmpService {
	@Autowired
	private EmpDao empDao;

	// Insert emp
	public String createEmp(Employee emp) {
		
		int i = empDao.saveEmp(emp);
		if(i>0)
		{
			return " Add Successfully";
		}
		else {
			return " something wrong";
		}

	}

	// Get  all emp
	public List<Employee> getEmp() {
		List<Employee> employee = empDao.getEmp();
		return employee;

	}
	//Geting single emp
	public Employee getSingleEmp(int empId)
	{
		Employee emp = empDao.getSingleEmp(empId);
		return emp;
	}

	//Delete emp
	public String deleteEmp(int empId) {
	int i = empDao.deleteEmp(empId);
		if(i>0)
		{
			return " Delete Successfully";
		}
		else {
			return " something wrong";
		}
	}
	
	//Update 
	public String updateEmp(Employee emp)
	{
		
		int i = empDao.updateEmp(emp);
		if(i>0)
		{
			return " Update Successfully";
		}
		else {
			return " something wrong";
		}
	}
	
	//search 
	public List<Employee> serachEmp(String name)
	{
		System.out.println(name);
		List<Employee> emp = empDao.searchEmp(name);
		return emp;
	}

}
