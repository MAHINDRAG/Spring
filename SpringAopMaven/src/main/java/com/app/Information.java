package com.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Information{
	@Pointcut("execution(public  int  getEmpId())")
	public void pointcut1(){}
	@Before("pointcut1()")
	public void showMsg(){
	   System.out.println("This is Before Advice Method");	
	}
	
	@Pointcut("execution(public * getEmpName(..))")
	public void pointcut2(){}
	@After("pointcut2()")
	public void showMsg2(){
		System.out.println("This is After Advice Method");
	}
	
	
	
}