package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface Emp_addService {

	public void AddEmploee();
	public List<Employee> displayAllEmp();
	public Employee displayById(int eId);
}
