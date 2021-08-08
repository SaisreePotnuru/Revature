package com.ers.service;

import java.util.List;

import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;

public interface EmployeeRegistrationService {

	 public void addEmployee(Employee e);
	 public List<EmployeeEntity> displayAllEmployees();
	 public void updateEmployee(Employee e);
}
