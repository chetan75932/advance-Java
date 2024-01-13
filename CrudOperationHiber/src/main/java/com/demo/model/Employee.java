package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpCrudH")
public class Employee
{
	@Id
	private int empId;
	private String empName;
	private double empSal;
	@Embedded
	private Address addId;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSal, Address addId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.addId = addId;
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

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Address getAddId() {
		return addId;
	}

	public void setAddId(Address addId) {
		this.addId = addId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", empName=").append(empName).append(", empSal=")
				.append(empSal).append(", addId=").append(addId).append("]");
		return builder.toString();
	}
	
	
	
}
