package com.crud.operation.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.operation.entities.Employee;
import com.crud.operation.entities.Manager;
import com.crud.operation.repository.EmployeeRepository;
import com.crud.operation.repository.ManagerRespository;

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerRespository managerRespository;
	@Autowired
	private EmployeeRepository empRepository;

	@PostMapping("/add")
	public ResponseEntity<String> addManager(@RequestBody Manager manager) {
		managerRespository.save(manager);
//	Manager	oldManager=managerRespository.findByName(manager.getName());
//		if(oldManager!=null)
//		{
//			 List<Employee> newList=new ArrayList<>();
//	          List<Employee> emplist=oldManager.getEmp();
//	          
//	          for (Employee employee : emplist) {
//				
//	        	  employee.setManager(oldManager);
//	        	  newList.add(employee);
//			}
//	          oldManager.setEmp(newList);
//	          managerRespository.save(oldManager);
//	          
//		}
		return new ResponseEntity<String>("Manager Saved", HttpStatus.CREATED);
	}

	@PutMapping("/assignManager")
	public ResponseEntity<String> assignmanger(@RequestBody Manager manager) 
	{
		//System.out.println(manager.toString());
                 Manager oldManager = managerRespository.findById(manager.getId());
                  List<Employee> oldEmpList = oldManager.getEmp();
		          List<Employee> newEmp = manager.getEmp();
                  for(Employee a:newEmp)
                  {
                	  a.setManager(oldManager);
                	  oldEmpList.add(a);
                	 
                  }
                  oldManager.setEmp(oldEmpList);
                managerRespository.save(oldManager);
              //  empRepository.save(oldEmpList);
                  return new ResponseEntity<String>("Assigned Successfully", HttpStatus.CREATED);
                  
                 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Manager olManager = managerRespository.findById(manager.getId());
//		if (olManager != null) {
//			List<Employee> oldlist = olManager.getEmp();
//			for (Employee newEmp : manager.getEmp()) {
//
//				Employee isEmployee = empRepository.findById(newEmp.getId());
//				if (isEmployee != null) {
//					isEmployee.setManager(olManager);
//					oldlist.add(isEmployee);
//				} else {
//					return new ResponseEntity<String>("Employee Not Found", HttpStatus.NOT_FOUND);
//				}
//
//			}
//			olManager.setEmp(oldlist);
//			managerRespository.save(olManager);
//			return new ResponseEntity<String>("Assigned Successfully", HttpStatus.CREATED);
//		} else {
//			return new ResponseEntity<String>("Manager Not Found", HttpStatus.NOT_FOUND);
//		}
	}

	// Get Manager
	@GetMapping("/get")
	public ResponseEntity<List<Manager>> getManager() {
          
		List<Manager> managerList=managerRespository.findAll();
		
		return  ResponseEntity.of(Optional.of(managerList));
	}
	//update Manager
	@PutMapping("/update")
	public ResponseEntity<String> updateManager(@RequestBody Manager manager)
	{
		Manager oldmanager = managerRespository.findById(manager.getId());
		oldmanager.setName(manager.getName());
		managerRespository.save(oldmanager);
		return new ResponseEntity<String>("Update suceessfully",HttpStatus.ACCEPTED);
	}
	//delete Manager
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteManager(@PathVariable("id") int id)	
	{
		 managerRespository.deleteById(id);
		 return new ResponseEntity<String>("Delete SuccessFully",HttpStatus.ACCEPTED);
		
	}
}
