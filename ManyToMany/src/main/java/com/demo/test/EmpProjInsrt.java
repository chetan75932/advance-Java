package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.Project;

public class EmpProjInsrt {

	public static void main(String[] args) 
	{
	  Employee e1=new Employee(1,"Shankar Mishra",70000.00);
	  Employee e2=new Employee(2,"Vishal kukreja",50000.00);
	  Employee e3=new Employee(3,"Viany Mishra",90000.00);
	  Employee e4=new Employee(4,"Prajwal Mishra",40000.00);
	  
	  List<Employee> elist1=new ArrayList<Employee>();
	  elist1.add(e1);
	  elist1.add(e2);
	  elist1.add(e3);
	  
	  List<Employee> elist2=new ArrayList<Employee>();
	  elist2.add(e1);
	  elist2.add(e4);
	  elist2.add(e3);
	  
	
	  
	  
	  Project p1=new Project(2,"AI","Chat-Bot");
	  Project p2=new Project(3,"Banking","Payment-System");
	  
	  List<Project> plist1=new ArrayList<Project>();
	  List<Project> plist2=new ArrayList<Project>();
	  List<Project> plist1_2=new ArrayList<Project>();
	  
	  plist1.add(p1);
	  plist2.add(p2);
	  
      plist1_2.add(p1);
	  plist1_2.add(p2);
	  
	  
	  e1.setP(plist1_2);
	  e2.setP(plist1);
	  e3.setP(plist1_2);
	  e4.setP(plist2);
	  
	  
	  SessionFactory sf=new Configuration().configure().buildSessionFactory();
	  Session s1=sf.openSession();
	  Transaction tr=s1.beginTransaction();
	  
	  s1.save(e1);
	  s1.save(e2);
	  s1.save(e3);
	  s1.save(e4);
	  s1.save(p1);
	  s1.save(p2);
	  
	  
	  tr.commit();
	  s1.close();
	  sf.close();
	  
	}

}
