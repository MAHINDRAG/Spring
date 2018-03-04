package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeDao {
	 public int insertEmployee(Employee emp);
	 public List<Employee> getAllEmployeeRecords();
	 public int deleteEmployee(Integer empId);
}
