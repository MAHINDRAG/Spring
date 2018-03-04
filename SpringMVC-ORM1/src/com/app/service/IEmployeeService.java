package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeService {
	 public int insertEmployee(Employee emp);
	 public List<Employee> getAllEmployeeRecords();
	 public int deleteEmployee(Integer empId);
}
