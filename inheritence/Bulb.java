package com.java.inheritence;

public class Bulb {
	
	public String brand;
	
	public Bulb()
	{
		System.out.println("the bulb runs in constructor");
	}
	
	public Bulb(String brand)
	{
	  this.brand=brand;
	}
	
	public void glow()
	{
		System.out.println("Brand:"+this.brand);
	}

}
