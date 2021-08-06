package com.ers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;

import com.ers.db.DBUtil;
import com.ers.model.Employee;

public class EmployeeLoginDaoImpl extends HttpServlet{
	
	
	 public void validate(String id, String pwd) {
		
		 try
	        {
			 Connection con=DBUtil.getConnection();
			 PreparedStatement ps1 = con.prepareStatement("select * from ers where employeeId = ? and password=?");
             ps1.setString(1,id);
		     ps1.setString(2,pwd);
		     ResultSet rs = ps1.executeQuery();
	        }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }
	    }
}