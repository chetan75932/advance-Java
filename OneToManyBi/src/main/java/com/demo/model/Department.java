package com.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="deptHOTM")
public class Department
{
	@Id
	private int deptNo;
	private String dName;
	private String dLoc;
	@OneToMany(mappedBy="dept")
	private Set<Employee> eset;
	public Department() {
		super();
	}
	public Department(int deptNo, String dName, String dLoc, Set<Employee> eset) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.dLoc = dLoc;
		this.eset = eset;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdLoc() {
		return dLoc;
	}
	public void setdLoc(String dLoc) {
		this.dLoc = dLoc;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", dName=" + dName + ", dLoc=" + dLoc + ", eset=" + eset + "]";
	}
	
	
	
}
