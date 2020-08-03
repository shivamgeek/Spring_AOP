package com.shivam.spring_aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String com.shivam.spring_aop.model.Triangle.getName())")
	public void LoggingAdvice() {
		System.out.println("LoggingAdvice method of aspect logging called");
	}
	
}
 