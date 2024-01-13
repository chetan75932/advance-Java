package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Customer;
import com.demo.model.Employee;

public class Emp_CustInherTest {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Harish","Talent Acqusition","HR");
		Employee emp2=new Employee(2,"Harshad","RND","HR");
		
		Customer cus1=new Customer(3,"Sharad","Sharad@345",502412);
		Customer cus2=new Customer(4,"Prajawal","Prajawal@655",6000000);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(emp1);
		s.save(emp2);
		s.save(cus1);
		s.save(cus2);
		tr.commit();
      
		
	}

}

