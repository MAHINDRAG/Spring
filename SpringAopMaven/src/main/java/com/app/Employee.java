package com.app;

public class Employee {
	private int empId;
	private String empName;
	

	public String getEmpName() {
		System.out.println("from empName getter");
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		System.out.println("from emp getter");
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId(int i) {
		System.out.println("from emp parameter Method");
		return i;
	}
	

}
