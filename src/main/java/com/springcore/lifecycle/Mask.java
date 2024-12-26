package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mask {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting mask price");
		this.price = price;
	}

	public Mask() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mask [price=" + price + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Inside init method ...Mask");
	}
	@PreDestroy
	public void stop()
	{
		System.out.println("Inside destroy method..Mask");
	}
	/*
	 * After java 9 we, have import dependency of postconstruct are predestroy..
	 */

}
