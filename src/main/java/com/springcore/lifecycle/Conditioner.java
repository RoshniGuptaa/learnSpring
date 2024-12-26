package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Conditioner implements InitializingBean ,DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price....Conditioner");
		this.price = price;
	}

	public Conditioner() {
		super();
	}

	@Override
	public String toString() {
		return "Conditioner [price of conditioner=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Throwing Conditioner : destory method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking conditioner : init method");
		
	}
	

}
