package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUserAddr {

	public static void main(String[] args) {
		Address addr1=new Address(1,"Pune","Maharashtra");
		Address addr2=new Address(2,"burhanpure","UP");
		MyUser user1=new MyUser(10,"chetan",addr1);
		MyUser user2=new MyUser(11,"saurabh",addr2);
		
	   SessionFactory sf=new Configuration().configure().buildSessionFactory();
	   
	   Session session=sf.openSession();
	   Transaction tr=session.beginTransaction();
	   
	   session.save(user1);
	   session.save(user2);
	   
	   
	   MyUser u3=session.get(MyUser.class,10);
	   System.out.println(u3);
	   tr.commit();
	   
	   
	}

}


