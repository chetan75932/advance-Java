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
		MyUser user1=new MyUser(10,"chetan","",addr1);
		MyUser user2=new MyUser(11,"saurabh","",addr2);
		
	   SessionFactory sf=new Configuration().configure().buildSessionFactory();
	   
	   Session session=sf.openSession();
	   Transaction tr=session.beginTransaction();
	   
	   
	   session.save(addr1);
	   session.save(addr2);
	   session.save(user1);
	   session.save(user2);
	   tr.commit();
	   
	   MyUser u3=session.get(MyUser.class,10);
	   System.out.println(u3+"get");
	   
	   
	   MyUser u4=session.load(MyUser.class,10);
	   System.out.println(u4+"load");
	   
	   Address ad3=session.get(Address.class,1);
	   System.out.println(ad3);
	  
	   
	   
	}

}


