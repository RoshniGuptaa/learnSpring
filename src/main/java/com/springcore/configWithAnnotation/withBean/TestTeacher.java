package com.springcore.configWithAnnotation.withBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context= new AnnotationConfigApplicationContext(TeacherConfig.class);
         Teacher t=(Teacher) context.getBean("getTeacherTopic");
         t.topic();
         
	}

}
