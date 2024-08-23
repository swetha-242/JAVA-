package com.xworkz.data;

public class MarketData {
	
	private String name;
	private String location;
	
	public MarketData(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void show()
	{
		System.out.println("the Name is:"+this.name);
		System.out.println("the Location is:"+this.location);
	}

}
