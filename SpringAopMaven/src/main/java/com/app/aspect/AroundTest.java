package com.app.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.customer.bo.CustomerBo;

public class AroundTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomerAround("mkyong");
	}

}
