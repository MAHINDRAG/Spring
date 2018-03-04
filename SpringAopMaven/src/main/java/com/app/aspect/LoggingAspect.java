package com.app.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LoggingAspect {
	@Pointcut("execution(* com.app.customer.bo.CustomerBo.addCustomerAround(..))")
	public void pointcut1(){
		
	}
	@Around("pointcut1()")
	 public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
			System.out.println("logAround() is running!");
			System.out.println("hijacked method : " + joinPoint.getSignature().getName());
			System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
			System.out.println("Around before is running!");
			joinPoint.proceed(); //continue on the intercepted method
			System.out.println("Around after is running!");
			System.out.println("******");
		   }
}
