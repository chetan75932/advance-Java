package com.demo.model;

public class Emp
{
    private int EmpID;
    private String EmpName;
    private double sal;
    private String mobile;
	public Emp() {
		super();
	}
	public Emp(int empID, String empName, double sal, String mobile) {
		super();
		EmpID = empID;
		EmpName = empName;
		this.sal = sal;
		this.mobile = mobile;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Emp [EmpID=" + EmpID + ", EmpName=" + EmpName + ", sal=" + sal + ", mobile=" + mobile + "]";
	}
    
    
}
