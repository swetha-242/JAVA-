package com.xworkz.data;

public class SandalData {
	
	private String brand;
    private char size;
    private int price;
    private String color;
    
	public SandalData(String brand, char size, int price, String color) {
		
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}
    
	public void show()
	{
		System.out.println("the Brand is:"+this.brand);
		System.out.println("the size is:"+this.size);
		System.out.println("the price is:"+this.price);
		System.out.println("the color is:"+this.color);
	}
    
}
