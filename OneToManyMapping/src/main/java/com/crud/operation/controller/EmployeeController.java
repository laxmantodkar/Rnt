package com.crud.operation.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.operation.dto.DtoMethod;
import com.crud.operation.entities.Employee;
import com.crud.operation.entities.EmployeeDto;
import com.crud.operation.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	DtoMethod dtoMethod=new DtoMethod();
	//Add Employee
	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		employeeRepository.save(employee);
		return new ResponseEntity<String>("Employee Added",HttpStatus.CREATED);
	}
	//Get Employee
	@GetMapping("/get")
	public ResponseEntity<List<EmployeeDto>> getEmp()
	{
		List<Employee> dbEmp = employeeRepository.findAll();
		List<EmployeeDto> newlist =dtoMethod.dtoMethod(dbEmp);
		
		return ResponseEntity.of(Optional.of(newlist));
		
	}
	//delete Employee
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") int id)
	{
             employeeRepository.deleteById(id);
             return new ResponseEntity<String>("Delete Successfully",HttpStatus.ACCEPTED);
	}
	//update Employee
	@PutMapping("/update")
	public ResponseEntity<String> updateEmp(@RequestBody Employee newEmp)
	{
		Employee dbEmp = employeeRepository.findById(newEmp.getId());	
		
		dbEmp.setId(newEmp.getId());
		dbEmp.setName(newEmp.getName());
		employeeRepository.save(dbEmp);
		return new ResponseEntity<String>("update Successfully",HttpStatus.ACCEPTED);
		
	}
}
