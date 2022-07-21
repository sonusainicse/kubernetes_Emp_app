package com.kubenetsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kubenetsdemo.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
