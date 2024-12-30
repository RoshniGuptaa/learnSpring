package com.springcore.configWithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s1=(Student) context.getBean("std1");
		System.out.println(s1.getSubject());
	}
}
