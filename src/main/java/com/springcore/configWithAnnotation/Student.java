package com.springcore.configWithAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;


@Component("std1")
public class Student {
	@Value("Mathematics")
	private String subject;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
