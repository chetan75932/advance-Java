package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUserAddr {

	public static void main(String[] args) {
		
		MyUser u1=new MyUser(1,"Somansh","Devloper");
		MyUser u2=new MyUser(2,"Vinayak","CEO");
		
		
		
		Address a1=new Address(5,"Indore","Mp",u1);
		Address a2=new Address(6,"Mumbai","Mh",u2);
		
	   SessionFactory sf=new Configuration().configure().buildSessionFactory();
	   Session session=sf.openSession();
	   Transaction tr=session.beginTransaction();
	   a1.setU1(u1);
	   a2.setU1(u2);
	  
	  u1.setAddr(a1);
	  u2.setAddr(a2);
	  
	  session.save(u1);
	  session.save(u2);
	  session.save(a1);
	  session.save(a2);
	  tr.commit();
	 System.out.println(session.load(MyUser.class,1));
	 System.out.println(session.load(MyUser.class,2));
	 System.out.println(session.get(Address.class,5).getU1());
	 
	 
	   
	   
	}

}


