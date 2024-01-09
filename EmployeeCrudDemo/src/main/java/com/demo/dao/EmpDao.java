package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {
     public List<Employee> getAllEmployee();

	public void AddEmp(Employee emp);

	public Employee SelectById(int empNo);
}
