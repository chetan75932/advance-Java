package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao {
	static Connection conn;
	static PreparedStatement selQue,insQue,selByIdQue;
	static {
		conn=DBUtil.getMyConnection();
		try {
			selQue=conn.prepareStatement("select * from Emp_dumy order by SAL");
			selByIdQue=conn.prepareStatement("select * from Emp_dumy where EMPNO=?");
			insQue=conn.prepareStatement("insert into Emp_dumy(EMPNO,ENAME,SAL) values(?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> elist=new ArrayList<> ();
		
		try {
			ResultSet rs=selQue.executeQuery();
			
			while(rs.next()) {
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
				elist.add(e);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return elist;
	}
	@Override
	public void AddEmp(Employee emp) {
		try {
			insQue.setInt(1, emp.getEmpNo());
			insQue.setString(2, emp.getEmpName());
			insQue.setInt(3, emp.getSal());
			insQue.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public Employee SelectById(int empNo) {
		System.out.println(empNo);
		Employee emp=null;
		try {
			selByIdQue.setInt(1, empNo);
			ResultSet rs=selByIdQue.executeQuery();
			
			return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
      
}
