package com.kubenetsdemo.service;

import java.util.List;

import com.kubenetsdemo.model.Employee;



public interface EmployeeService {
Employee saveEmployee(Employee emp);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}
