package com.crud.operation.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.crud.operation.entities.Employee;
import com.crud.operation.entities.EmployeeDto;

public class DtoMethod 
{
          public List<EmployeeDto> dtoMethod(List<Employee> dbemployees)
          {
        	  List<EmployeeDto> newList=new ArrayList<>();
        	  for(Employee a:dbemployees)
        	  {
        		  EmployeeDto employeeDto=new EmployeeDto();
        		  employeeDto.setId(a.getId());
        		  employeeDto.setName(a.getName());
        		 // employeeDto.setManager(a.getManager());
        		  newList.add(employeeDto);
        	  }
        	  return newList;
          }

}
