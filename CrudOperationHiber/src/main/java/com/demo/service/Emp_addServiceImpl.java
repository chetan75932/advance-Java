package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.Emp_addDao;
import com.demo.dao.Emp_addDaoImpl;
import com.demo.model.Address;
import com.demo.model.Employee;

public class Emp_addServiceImpl  implements Emp_addService
{
	static Emp_addDao eadd;
	
	static {
		eadd=new Emp_addDaoImpl();
	}

	public void AddEmploee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId :");
		int empId=sc.nextInt();
		System.out.println("Enter EmpName :");
		String empName=sc.next();
		System.out.println("Enter EmpSal :");
		double empSal=sc.nextDouble();
		System.out.println("Enter addId :");
		int addId=sc.nextInt();
		System.out.println("Enter city :");
		String city=sc.next();
		System.out.println("Enter state :");
		String state=sc.next();
		
		Employee e=new Employee(empId,empName,empSal, new Address(addId,city,state));
		eadd.addNewEmp(e);
	}

	public List<Employee> displayAllEmp() {
		
		return eadd.displayAll();
	}

	@Override
	public Employee displayById(int eId) {
		return eadd.displayById(eId);
	}

}

