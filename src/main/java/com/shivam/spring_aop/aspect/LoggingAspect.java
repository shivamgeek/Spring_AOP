package com.shivam.spring_aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*
	 * Use * for matching one or more characters
	 * Use .. for matching 0 or more characters
	 * 
	 * 
	 */
	
	
	@Before("dummyPointcutFunction() && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("LoggingAdvice method of aspect logging invoked");
	}
	
	@Before("allCircleMethods()")
	public void SecondLoggingAdvice() {
		System.out.println("SecondLoggingAdvice() of logging invoked");
	}
	
	//for all functions with below signature having "get" in it's name. "execution" pointcut works for method names
	@Pointcut("execution(public String get*())")
	public void dummyPointcutFunction() {}
	
	//for all functions of circle class. "within" pointcut works for class names
	@Pointcut("within(com.shivam.spring_aop.model.Circle)")
	public void allCircleMethods() {}
	
}
 