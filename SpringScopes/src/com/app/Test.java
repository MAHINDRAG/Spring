package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee e=(Employee) context.getBean("emp");
		System.out.println("Employee hascode :"+e.hashCode()+"Address hashcode :"+e.getAddr().hashCode());
		
		
		Employee e1=(Employee) context.getBean("emp");
		System.out.println("Employee hascode :"+e1.hashCode()+"Address hashcode :"+e1.getAddr().hashCode());
		
		
		
	}

}
