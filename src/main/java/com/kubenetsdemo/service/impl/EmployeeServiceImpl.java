package com.kubenetsdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kubenetsdemo.model.Employee;
import com.kubenetsdemo.repository.EmployeeRepository;
import com.kubenetsdemo.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	
private	EmployeeRepository employeeRepository ;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		 return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		java.util.Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}


	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}

}
