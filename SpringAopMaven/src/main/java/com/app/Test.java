package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=context.getBean("empobj",Employee.class);
		emp.getEmpId();
		System.out.println("Before Advice successfully executed");
		emp.getEmpName();
		System.out.println("After advice successfully executed :");
	}

}
