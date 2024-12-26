package com.springcore.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class ReferenceTest {

	public static void main (String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		A temp=(A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
		
		A temp2=(A) context.getBean("aref2");
		System.out.println(temp2.getX());
		System.out.println(temp2.getObj().getY());
				
	}
}
