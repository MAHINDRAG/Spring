package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Object ob=context.getBean("sf");
	if(ob instanceof Employee){
		Employee emp=(Employee) ob;
		System.out.println(emp);
	}
	if(ob instanceof Address){
		Address addr=(Address) ob;
		System.out.println(addr);
	}
	System.out.println("Done");
}
}
