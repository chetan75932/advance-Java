package com.demo.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.Employee;

public class Emp_addDaoImpl implements Emp_addDao{

	public void addNewEmp(Employee e) 
	{
     	Session s=Hiberutil.getMySession();
		Transaction tr=s.beginTransaction();
		s.save(e);
		tr.commit();
	}
	
	public List<Employee> displayAll()
	{
		//JPQL--->java persistance Query Language
		Session s=Hiberutil.getMySession();
		CriteriaBuilder cb=s.getCriteriaBuilder();
		
		CriteriaQuery<Employee> cr2=cb.createQuery(Employee.class);
	
		Root<Employee> rt=cr2.from(Employee.class);
		
		Query q=s.createQuery(cr2.select(rt));
		
		List<Employee> elist=q.getResultList();
		
		return elist;
		
	}

	@Override
	public Employee displayById(int eId) {
		Session s=Hiberutil.getMySession();
		String hql = "FROM Employee E WHERE E.id = :eId";
		Query query = s.createQuery(hql);
		query.setParameter("eId",eId);
		
		List<Employee> results = query.getResultList();
		
		Employee e=results.get(0);
		
		return e;
	}
}


