package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/standalone/collections/stdaloneconfig.xml");
		
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
		System.out.println("-------------------------------------");
	     System.out.println(p1.getFriends().getClass());
		System.out.println(p1.getFriends());
		System.out.println("*********************************************");
		 System.out.println(p1.getFees().getClass());
			System.out.println(p1.getFees());
			System.out.println("*_*_*_*_**__*_*_*_*__*");
			System.out.println("properties: \n" +p1.getProperties().getClass());
			System.out.println(p1.getProperties());
	}
	
}
