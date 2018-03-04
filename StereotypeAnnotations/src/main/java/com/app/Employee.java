package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empobj")
public class Employee {
	@Value(value = "100")
  private int empId;
	@Value(value = "Mahindra")
  private String empName;
	@Value(value = "50000")
  private double empSal;
  @Autowired
  private Address addr;
  
  
public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getEmpSal() {
	return empSal;
}

public void setEmpSal(double empSal) {
	this.empSal = empSal;
}

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal="
			+ empSal + ", addr=" + addr + "]";
}
  
  
}
