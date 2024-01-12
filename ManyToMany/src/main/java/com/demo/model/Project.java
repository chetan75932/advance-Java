package com.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ProjectHMTM")
public class Project
{
    @Id
	private int proId;
    private String field;
    private String proName;
    @ManyToMany(mappedBy="p")
    private List<Employee> e;
    
    
	public Project() {
		super();
	}


	public Project(int proId, String field, String proName, List<Employee> e) {
		super();
		this.proId = proId;
		this.field = field;
		this.proName = proName;
		this.e = e;
	}
	
	public Project(int proId, String field, String proName) {
		super();
		this.proId = proId;
		this.field = field;
		this.proName = proName;
		
	}


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public List<Employee> getE() {
		return e;
	}


	public void setE(List<Employee> e) {
		this.e = e;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Project [proId=").append(proId).append(", field=").append(field).append(", proName=")
				.append(proName).append("]");
		return builder.toString();
	}


	
    
}
