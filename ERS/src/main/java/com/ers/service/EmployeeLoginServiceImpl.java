package com.ers.service;

import com.ers.dao.EmployeeLoginDaoImpl;
import com.ers.model.Employee;

public class EmployeeLoginServiceImpl implements EmployeeLoginService{
	EmployeeLoginDaoImpl employeeDao=new EmployeeLoginDaoImpl();
	 public void validate(String id, String pwd) {
		 employeeDao.validate( id, pwd);
		 
	 }
}
