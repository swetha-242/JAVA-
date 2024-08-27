package com.java.inheritence;

public class SmartPhone {
	
	public String brand;
	public double price;
	public String color;
	public boolean cameraQuality;
	
	public SmartPhone()
	{
		System.out.println("the smartphone contains the different properties");
	}

	public SmartPhone(String brand, int price, String color, boolean cameraQuality) 
	{
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.cameraQuality = cameraQuality;
	}
	
	public SmartPhone(String brand, int price) 
	{
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public SmartPhone(String color) 
	{
		super();
		this.color = color;
	}
	
	
	public void Display()
	{
		System.out.println("brand is:"+this.brand);
		System.out.println("price is:"+this.price);
		System.out.println("color is:"+this.color);
		System.out.println("cameraQuality is:"+this.cameraQuality);
	}

}
