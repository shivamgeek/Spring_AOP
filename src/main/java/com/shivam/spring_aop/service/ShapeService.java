package com.shivam.spring_aop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shivam.spring_aop.model.Circle;
import com.shivam.spring_aop.model.Triangle;

public class ShapeService {

	@Autowired
	private Triangle triangle;
	private Circle circle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
	
}
