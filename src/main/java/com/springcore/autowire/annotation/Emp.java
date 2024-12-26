package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	//@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
//	Using autowired ,if there are two bean of same type then it will throw an error
	//Therefore ,Qualifier is used for by name autowiring
	@Autowired
	@Qualifier("address")
	public void setAddress(Address address) {
		System.out.println("Setter Injection");
		
		this.address = address;
	}

	public Emp(Address address) {
		super();
		System.out.println("Constructor Injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
