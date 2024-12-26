package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShampoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
//		Shampoo p=(Shampoo) context.getBean("prd1");
//		System.out.println(p);
//		
		//Destroy method is not called 
		//Now hook-registerShutsownHook()
		

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		context.registerShutdownHook();
		Shampoo p=(Shampoo) context.getBean("prd1");
		System.out.println(p);
		
		
		//Testing Conditioner using lifecycle interfaces
		
		System.out.println("..................******************************................................");
		Conditioner p2=(Conditioner) context.getBean("prd2");
		System.out.println(p2);
		
		//Testing mask using lifecycle annotation
		
		Mask p3=(Mask) context.getBean("prd3");
		System.out.println(p3);
	}

}
