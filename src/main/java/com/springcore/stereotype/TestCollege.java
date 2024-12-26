package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {

	public static void main(String[] args) {
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		College c= context.getBean("college",College.class);
		System.out.println(c.hashCode());
		System.out.println(c.getCollegeName());
		College c2= context.getBean("college",College.class);
		System.out.println(c2.hashCode());
		System.out.println(c2.getState());
		System.out.println(c2.getCourses());
		 
	}
}
