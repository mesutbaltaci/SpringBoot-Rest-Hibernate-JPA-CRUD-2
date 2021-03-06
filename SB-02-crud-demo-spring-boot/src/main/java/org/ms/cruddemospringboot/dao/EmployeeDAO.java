package org.ms.cruddemospringboot.dao;

import java.util.List;

import org.ms.cruddemospringboot.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findEmployeeById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
