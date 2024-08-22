package com.xworkz.java1;

public class Plant {
	 
	private String name;
	private String color;
	private int price;
	private double total;
	private boolean good;
	private String plantDate="10-08-2024";
	private String plantPersonName="Veeresh";
	private double colors=10;
	private boolean flavor=true;
	private int perPlantCost=50;
	
	public Plant(String name,String color, int price,double total,boolean good)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.total=total;
		this.good=good;
	}
	
	public void print()
	
	{
		System.out.println("Name:"+this.name);
		System.out.println("Color:"+this.color);
		System.out.println("Price:"+this.price);
		System.out.println("Total:"+this.total);
		System.out.println("Good:"+this.good);
		System.out.println("PlantDate:"+this.plantDate);
		System.out.println("PlantPersonName:"+this.plantPersonName);
		System.out.println("Colors:"+this.colors);
		System.out.println("Flavor:"+this.flavor);
		System.out.println("PerPlantCost:"+this.perPlantCost);
	}
}