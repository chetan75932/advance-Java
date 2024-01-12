package com.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeHMTM")
public class Employee 
{
   @Id
   private int Id;
   private String eName;
   private double eSalary;
   @ManyToMany
   @JoinTable(name="emp_projH",joinColumns= {@JoinColumn(name="Empid")},inverseJoinColumns= {@JoinColumn(name="projId")})
   private List<Project> p;
   
   
    public Employee() {
	super();
    }


	public Employee(int id, String eName, double eSalary, List<Project> p) {
		super();
		Id = id;
		this.eName = eName;
		this.eSalary = eSalary;
		this.p = p;
	}

	
	public Employee(int id, String eName, double eSalary) {
		super();
		Id = id;
		this.eName = eName;
		this.eSalary = eSalary;
		
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public double geteSalary() {
		return eSalary;
	}


	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}


	public List<Project> getP() {
		return p;
	}


	public void setP(List<Project> p) {
		this.p = p;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Id=").append(Id).append(", eName=").append(eName).append(", eSalary=").append(eSalary)
				.append(", p=").append(p).append("]");
		return builder.toString();
	}
    
    
}
