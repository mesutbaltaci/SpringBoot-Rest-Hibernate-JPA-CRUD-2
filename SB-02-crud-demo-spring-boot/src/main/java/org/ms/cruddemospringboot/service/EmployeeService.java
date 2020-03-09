package org.ms.cruddemospringboot.service;

import java.util.List;

import org.ms.cruddemospringboot.entity.Employee;

public interface EmployeeService {
public List<Employee> findAll();
	
	public Employee findEmployeeById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	

}
