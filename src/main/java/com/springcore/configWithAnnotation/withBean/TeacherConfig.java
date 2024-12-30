package com.springcore.configWithAnnotation.withBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.configWithAnnotation.withBean")
public class TeacherConfig {

	//This method should return bean object
	@Bean
	public Teacher getTeacherTopic() {
		
		//creating teacher object
		Teacher t=new Teacher();
		
		return t;
	}
}
