package com.shivam.spring_aop.model;

import com.shivam.spring_aop.aspect.Loggable;

public class Circle {
	
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
