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

/**
 * Servlet implementation class EditEmp
 */
@WebServlet("/EditEmp")
public class EditEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService eservice=new EmpServiceImpl();
		int EmpNo=Integer.parseInt(request.getParameter("empNo"));
		System.out.println(EmpNo);
		Employee e=eservice.SelectEmpById(EmpNo);
		request.setAttribute("emp",e);
		System.out.println(e);
        RequestDispatcher rd=request.getRequestDispatcher("EditEmp.jsp");
        rd.forward(request, response);
		
	}

}
