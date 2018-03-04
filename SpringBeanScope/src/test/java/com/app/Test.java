package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Employee emp=(Employee)context.getBean("empobj");
	System.out.println("Employee :"+emp.hashCode()+"\t Address :"+emp.getAddr().hashCode());
	
	Employee emp1=(Employee)context.getBean("empobj");
	System.out.println("Employee :"+emp1.hashCode()+"\t Address :"+emp1.getAddr().hashCode());
	
	Employee emp2=(Employee)context.getBean("empobj");
	System.out.println("Employee :"+emp2.hashCode()+"\t Address :"+emp2.getAddr().hashCode());
	
}
}
