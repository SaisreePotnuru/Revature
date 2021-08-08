package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;

/**
 * Servlet implementation class ListAllEmployeeForUpdate
 */
public class ListAllEmployeeForUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();

		List<EmployeeEntity> elist=employeeService.displayAllEmployees();
		PrintWriter out=response.getWriter();
		
			out.println("<form>");
			out.println("<select>");
			
			for(EmployeeEntity e:elist) {
				
				out.println("<option name='id'> "+e.getEmployeeId());
			}
			out.println("</select></form>");
			
			
	}

}
