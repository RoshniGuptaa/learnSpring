package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorInjection.Person;

public class AutowireTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext   context =new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
        Emp emp1= (Emp) context.getBean("emp1");
        
        System.out.println(emp1);

	}

}
