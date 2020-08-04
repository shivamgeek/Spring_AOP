package com.shivam.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
	
	
	@After("allCircleMethods()")
	public void LoggingAdvice(JoinPoint pt) {
		System.out.println("Advice invoking method : "+pt);
	}
	
	@Before("@annotation(com.shivam.spring_aop.aspect.Loggable)")
	public void customAnnotation() {
		System.out.println("This is a custom Loggable Annotation");
	}
	
	//for all functions with below signature having "get" in it's name. "execution" pointcut works for method names
	@Pointcut("execution(public String get*())")
	public void dummyPointcutFunction() {}
	
	//for all functions of circle class. "within" pointcut works for class names
	@Pointcut("within(com.shivam.spring_aop.model.Circle)")
	public void allCircleMethods() {}
	
}
 