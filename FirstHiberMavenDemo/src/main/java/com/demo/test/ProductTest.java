package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class ProductTest {
   public static void main(String[] args) {
	   SessionFactory sf=new Configuration().configure().buildSessionFactory();
	   Session s=sf.openSession();
	   Transaction tr=s.beginTransaction();
	   
	   Product p1=new Product("Chair",5);
	   Product p2=new Product("IPhone",10);
	   
	   s.save(p1);
	   s.save(p2);
	   
	   tr.commit();
	   
	   
	   Product p=s.get(Product.class, 1);
	   
	   System.out.println(p);
	   
	   s.close();
	   sf.close();
   }
}



