package com.demo.model;

public class Employee {
    private int empNo;
    private String empName;
    private  int sal;
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, int sal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + "]";
	}
    
    
}
