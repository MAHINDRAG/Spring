package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;
import com.app.service.IEmployeeService;
@Service("empService")
public class IEmployeeServiceImpl implements IEmployeeService {
    @Autowired
	private IEmployeeDao empDao;
	@Override
	public int insertEmployee(Employee emp) {
		return empDao.insertEmployee(emp);
	}
	@Override
	public List<Employee> getAllEmployeeRecords() {
		List<Employee> empList=empDao.getAllEmployeeRecords();
		return empList;
	}
	@Override
	public int deleteEmployee(Integer empId) {
		System.out.println("Service Layer");
		return empDao.deleteEmployee(empId);
		
	}

}
