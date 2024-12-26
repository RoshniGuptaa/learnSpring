package com.springcore.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext   context =new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constconfig.xml");
           Person p1= (Person) context.getBean("person1");
           
           System.out.println(p1);
	}

}
