package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestEmpDept {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,"Tejas",50000);
		Employee emp2=new Employee(2,"Tejas12",55000);
		Employee emp3=new Employee(3,"Tejas123",60000);
		Employee emp4=new Employee(4,"Tejas1234",650000);
		
		
		Set<Employee> eset1=new HashSet<Employee>();
		eset1.add(emp1);
		eset1.add(emp2);
		
		Set<Employee> eset2=new HashSet<Employee>();
		eset2.add(emp3);
		eset2.add(emp4);
		
		Department dept1=new Department(10,"Finance","Pune",eset1);
		Department dept2=new Department(20,"H.R.","Mumbai",eset2);
		
		emp1.setDept(dept2);
		emp2.setDept(dept1);
		emp3.setDept(dept2);
		emp4.setDept(dept1);

		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		
		session.save(dept1);
		session.save(dept2);
		tr.commit();
	}

}


/*
this.deptNo = deptNo;
		this.dName = dName;
		this.dLoc = dLoc;
		this.eset = eset;
*/