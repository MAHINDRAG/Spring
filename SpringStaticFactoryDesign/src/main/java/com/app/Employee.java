package com.app;

public class Employee {
private int empId;
private String empName;
public Employee() {
	super();
}
public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
	System.out.println("Emp Constructor");
}
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
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + "]";
}

}
