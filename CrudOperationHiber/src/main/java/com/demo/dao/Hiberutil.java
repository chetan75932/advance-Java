package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberutil 
{
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	static Session s;
	
	
	public static Session getMySession()
	{
	     if(s==null)
	     {
	    	 s=sf.openSession();
	    	 
	    	 return s;
	     }
	     
	     return s;
	}
	
	public static void closeMyConnection()
	{
		if(s!=null)
		{
			s.close();
			sf.close();
		}
			
	}
	
	
			
    
			
			
			
			
}
