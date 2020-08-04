package com.shivam.spring_aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	/*
	 * Use * for matching one or more characters
	 * Use .. for matching 0 or more characters
	 * 
	 * 
	 */
	
	
	@Before("execution(public * get*(..))")
	public void LoggingAdvice() {
		System.out.println("LoggingAdvice method of aspect logging invoked");
	}
	
}
 