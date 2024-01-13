package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface Emp_addDao {

	public void addNewEmp(Employee e);
	
	public List<Employee> displayAll();

	public Employee displayById(int eId);

}
