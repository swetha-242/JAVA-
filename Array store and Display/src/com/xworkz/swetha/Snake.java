package com.xworkz.swetha;

public class Snake {
	
	private String name;
	private int length;
	private String type;
	
	public Snake(String name,int length,String type)
	{
		this.name=name;
		this.length=length;
		this.type=type;
	System.out.println("the snake is created with the 3 variables");
	}
	
	public void print()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Length:"+this.length);
		System.out.println("Type:"+this.type);
	}

}
