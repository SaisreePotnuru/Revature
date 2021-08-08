package com.ers.service;

import java.util.List;

import com.ers.dao.EmployeeRegistrationDaoImpl;
import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;

public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService{
	EmployeeRegistrationDaoImpl employeeDao=new EmployeeRegistrationDaoImpl();
	 public void addEmployee(Employee e) {
		 employeeDao.addEmployee(e);
		 
	 }
	 public void updateEmployee(Employee e){
		 employeeDao.updateEmployee(e);
	 }
	 public List<EmployeeEntity> displayAllEmployees(){
		 
		 return employeeDao.displayAllEmployees();
	 }
}
