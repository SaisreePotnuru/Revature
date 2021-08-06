package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.dao.EmployeeLoginDao;
import com.ers.model.Employee;
import com.ers.service.EmployeeLoginServiceImpl;
import com.ers.service.EmployeeRegistrationServiceImpl;

public class EmployeeLoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		Employee employee=new Employee();
		employee.setEmployeeId(Integer.parseInt(id));
		employee.setPassword(pwd);
		
		//service need to be invoked 
		EmployeeLoginServiceImpl employeeLoginService =new EmployeeLoginServiceImpl();
		employeeLoginService.validate( id, pwd);
		out.println(" Login success");
		out.println(id+" ");
		
	}
}