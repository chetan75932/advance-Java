package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empHOTM")
public class Employee
{
	@Id
	private int empId;
	
	private String empName;
	private double sal;
	@OneToOne
	@JoinColumn(name="deptId")
	private Department dept;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double sal, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.dept = dept;
	}
	
	
	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	
	
}