package com.demo.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmpProjRetrieTest {

	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		
		//hql query tried
		Query query=s1.createQuery("from Employee");
		
		List<Employee> elist=query.getResultList();
		
		elist.stream().forEach(System.out::println);
		
		tr.commit();
		s1.close();
		sf.close();

	}

}
