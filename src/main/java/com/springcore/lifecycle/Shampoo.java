package com.springcore.lifecycle;

public class Shampoo {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price...Shampoo");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shampoo [price=" + price + "]";
	}

	public Shampoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("Inside init method  :..... Getting Shampoo");
	}
	public void destroy()
	{
		System.out.println("Inside destory method:.......Throwing Shampoo");
	}
}
