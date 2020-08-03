package com.shivam.spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shivam.spring_aop.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_data.xml");
        ShapeService service = context.getBean("shapeservice_id",ShapeService.class);
        System.out.println("Name is "+service.getTriangle().getName());
        System.out.println("Name is "+service.getCircle().getName());
    }
}
