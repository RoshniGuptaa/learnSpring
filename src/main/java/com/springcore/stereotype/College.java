package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")........prototype scope creates different object everytime  .. while singleton creates object only once
public class College {

	@Value("Chandigarh University")
	private String collegeName;
	@Value("Punjab")
	private String state;
	
	// Injecting collection with @value using xml standAlone collections
	@Value("#{course}")
	private List<String> courses;
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
