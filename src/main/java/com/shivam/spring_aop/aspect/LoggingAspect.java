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
	
	
	@Before("dummyPointcutFunction()")
	public void LoggingAdvice() {
		System.out.println("LoggingAdvice method of aspect logging invoked");
	}
	
	@Before("dummyPointcutFunction()")
	public void SecondLoggingAdvice() {
		System.out.println("SecondLoggingAdvice() of logging invoked");
	}
	
	@Pointcut("execution(public String get*())")
	public void dummyPointcutFunction() {}
	
}
 