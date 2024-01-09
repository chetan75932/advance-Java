package com.demo.service;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService {
	EmpDao edao=new EmpDaoImpl();
	@Override
	public List<Employee> getAllEmp() {
		
		return edao.getAllEmployee();
	}
	@Override
	public void addNewEmp(Employee emp) {
		 edao.AddEmp(emp);
		
	}
	@Override
	public Employee SelectEmpById(int empNo) {
		return edao.SelectById(empNo);
		
	}

}
