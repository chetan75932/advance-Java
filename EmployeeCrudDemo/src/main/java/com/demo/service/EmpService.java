package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	public List<Employee> getAllEmp();

	public void addNewEmp(Employee emp);

	public Employee SelectEmpById(int empNo);

}
