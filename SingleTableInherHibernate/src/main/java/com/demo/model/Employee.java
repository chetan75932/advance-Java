package com.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends Person{
      
      private String dept;
      private String desg;
	public Employee() {
		super();
	}
	public Employee(int pId, String pName,String dept, String desg) {
		super(pId,pName);
		this.dept = dept;
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [dept=").append(dept).append(", desg=").append(desg).append("]");
		return builder.toString();
	}
      
      
}
