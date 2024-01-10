package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Emp;

public class Emptest {

	public static void main(String[] args)
	{
		//configure("") we are allowed to give which hibernate configure file to give
		// by default it will take hibernate.cfg.xml
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		
		Session s=sf.openSession();
		
		Transaction tr=s.beginTransaction();
		//it is transient state
	//	Emp e=new Emp(1,"Mahesh",78000.00,"9853783854");
		
		Emp e2=new Emp(2,"Dinesh",79000.00,"9953783854");
		//persistance state
	//	s.save(e);
		s.save(e2);
		//insertin table now
		tr.commit();
	}

}
