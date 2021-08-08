package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;
import com.ers.service.EmployeeRegistrationServiceImpl;

/**
 * Servlet implementation class DisplayEmployees
 */
public class DisplayEmployees extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		
       PrintWriter out=response.getWriter();
		List<EmployeeEntity> elist=employeeService.displayAllEmployees();
	/*	HttpSession session=request.getSession(true);
		session.setAttribute("elist",elist);
		response.sendRedirect("dispallemployees.jsp");
		*/
		out.println("<table width=200 height=200 border=1>");
		out.println("<caption> Employee Details </caption>");
		
		for(EmployeeEntity e:elist) {
			
			out.println("<tr><td>"+e.getEmployeeName()+"</td><td>"+e.getEmail()+"<td></tr>");
		}
		out.println("</table>");
		
		out.println("<form action='index.jsp'> <input type='submit' value='back to Home'></form> ");
		
	}

}
