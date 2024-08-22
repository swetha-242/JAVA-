package com.xworkz.java1;

public class Ball {
    
	private String name;
	private String color;
	private int price;
	private double total;
	private boolean good;
	private String shape;
	private int velocity;
	private boolean spin;
	private String manufactureDate="10-08-2024";
	private String ownerName="ganesh";
	private double colors=10;
	private boolean goodProduct=true;
	private int perBallCost=50;
	private String ballmanuName="seetha";
	private boolean ballQuality=true;
	private String ballwarranty="2 years";
	private int ballAirResistance=200;
	private double elasticity=3240;
	private String ballkickName="Rohith";
	private String ballManuAddress="Bangalore";
	private String ballTranportVechle="KA 14 3456";
	private double brandBollTotal=70000;
	private String bestBrand="Puma";
	private String position="Middle";
	private boolean bestBall=true;
	
	public Ball(String name,String color, int price,double total,boolean good,String shape,int velocity,boolean spin)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.total=total;
		this.good=good;
		this.shape=shape;
		this.velocity=velocity;
		this.spin=spin;
	}
	
	public void print()
	
	{
		System.out.println("Name:"+this.name);
		System.out.println("Color:"+this.color);
		System.out.println("Price:"+this.price);
		System.out.println("Total:"+this.total);
		System.out.println("Good:"+this.good);
		System.out.println("Shape:"+this.shape);
		System.out.println("Velocity:"+this.velocity);
		System.out.println("Spin:"+this.spin);
		System.out.println("ManufactureDate:"+this.manufactureDate);
		System.out.println("ownerName:"+this.ownerName);
		System.out.println("Colors:"+this.colors);
		System.out.println("goodProduct:"+this.goodProduct);
		System.out.println("perBallCost:"+this.perBallCost);
		System.out.println("ballmanuName:"+this.ballmanuName);
		System.out.println("ballQuality:"+this.ballQuality);
		System.out.println("ballwarranty:"+this.ballwarranty);
		System.out.println("ballAirResistance:"+this.ballAirResistance);
		System.out.println("elasticity:"+this.elasticity);
		System.out.println("ballkickName:"+this.ballkickName);
		System.out.println("ballManuAddress:"+this.ballManuAddress);
		System.out.println("ballTranportVechle:"+this.ballTranportVechle);
		System.out.println("brandBollTotal:"+this.brandBollTotal);
		System.out.println("bestBrand:"+this.bestBrand);
		System.out.println("position:"+this.position);
		System.out.println("bestBall:"+this.bestBall);
	}
}
