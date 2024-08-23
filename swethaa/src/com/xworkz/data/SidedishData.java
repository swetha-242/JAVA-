package com.xworkz.data;

public class SidedishData {
	
	private String name;
	private int price;
	private String type;
	
	public SidedishData(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void show()
	{
		System.out.println("the Name is:"+this.name);
		System.out.println("the Price is:"+this.price);
		System.out.println("the Type is:"+this.type);
	}

}
