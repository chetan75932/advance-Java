package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class ProductUpdateTest {
	public static void main(String[] args) {
		   SessionFactory sf=new Configuration().configure().buildSessionFactory();
		   Session s=sf.openSession();
		   Transaction tr=s.beginTransaction();
		   
		   Product p1=new Product("Chair",5);
		   Product p2=new Product("IPhone",10);
		   
		   s.save(p1);
		   s.save(p2);
		   
		   tr.commit();
		   
		   s.close();
		   p1.setProName("Table");
		   
		   Session s2=sf.openSession();
		   //persistance state
		   Product  p3=s2.get(Product.class,1);
		   
		   System.out.println("before commit "+p3);
		   
		   Transaction tr1=s2.beginTransaction();
		   
		   //s2.update(p1);
		   s2.merge(p1);
		   
		   
		   System.out.println(s2.get(Product.class,1));
		   
		   s2.delete(p3);
		   tr1.commit();
		   
		   s2.close();
		 
		   
  }
}
