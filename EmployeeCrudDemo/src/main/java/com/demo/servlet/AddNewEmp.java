package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;


@WebServlet("/AddEmp")
public class AddNewEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService eservice=new EmpServiceImpl();
		
		int EmpNo=Integer.parseInt(request.getParameter("empNo"));
		String EmpName=request.getParameter("empName");
		int Sal=Integer.parseInt(request.getParameter("empSal"));
		Employee emp=new Employee(EmpNo,EmpName,Sal);
		eservice.addNewEmp(emp);
		RequestDispatcher rd=request.getRequestDispatcher("/DisplayEmployee");
		rd.forward(request, response);
		
		
	}

}
