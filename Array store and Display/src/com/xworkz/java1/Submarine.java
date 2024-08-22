package com.xworkz.java1;

public class Submarine {
	
	private String name;
	private String color;
	private int price;
	private double total;
	private boolean good;
	private String shape="rectangle";
	private int velocity=60;
	private boolean spin=true;
	private String manufactureDate="10-08-2024";
	private String ownerName="gelvin";
	private double colors=10;
	private boolean goodProduct=true;
	private int perFishCost=50;
	private String submarinemanuName="equator";
	private boolean submarineQuality=true;
	private String submarinewarranty="2 years";
	private int length=200;
	private double width=3240;
	private String submarineownerName="sharma";
	private String submarineManuAddress="mangalore";
	private String submarineTranportVechle="KA 15 AD 2678";
	private double brandSubmarineTotal=705678;
	private String bestsubmarine="Dallas";
	private String position="corner";
	private boolean submarinePresent=true;
	private int numbeofCompartments=60;
	private String material="Steel";
	private boolean DepthRating=true;
	private String batteryCapacity="better volt";
	private int maxSpeed=430;
	private int minSpeed=300;
	private String fuelCapacity="full";
	private String sonarSystem="Active";
	private String communicationSystem="Radio";
	private int foodStorageCapacity=300;
	private String lifeSupportSystems="Oxygen";
	private boolean divingPlanes=true;
	private double mineLayingCapacity=6000;
	private int crewCapacity=340;
	private boolean emergencyEscapeSystem=true;
	
	public Submarine(String name,String color, int price,double total,boolean good)
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
		System.out.println("Shape:"+this.shape);
		System.out.println("Velocity:"+this.velocity);
		System.out.println("Spin:"+this.spin);
		System.out.println("ManufactureDate:"+this.manufactureDate);
		System.out.println("ownerName:"+this.ownerName);
		System.out.println("Colors:"+this.colors);
		System.out.println("goodProduct:"+this.goodProduct);
		System.out.println("perFishCost:"+this.perFishCost);
		System.out.println("submarinemanuName:"+this.submarinemanuName);
		System.out.println("submarineQuality:"+this.submarineQuality);
		System.out.println("submarinewarranty:"+this.submarinewarranty);
		System.out.println("length:"+this.length);
		System.out.println("width:"+this.width);
		System.out.println("submarineownerName:"+this.submarineownerName);
		System.out.println("submarineManuAddress:"+this.submarineManuAddress);
		System.out.println("submarineTranportVechle:"+this.submarineTranportVechle);
		System.out.println("brandSubmarineTotal:"+this.brandSubmarineTotal);
		System.out.println("bestsubmarine:"+this.bestsubmarine);
		System.out.println("position:"+this.position);
		System.out.println("submarinePresent:"+this.submarinePresent);
		System.out.println("numbeofCompartments:"+this.numbeofCompartments);
		System.out.println("material:"+this.material);
		System.out.println("DepthRating:"+this.DepthRating);
		System.out.println("batteryCapacity:"+this.batteryCapacity);
		System.out.println("maxspeed:"+this.maxSpeed);
		System.out.println("minspeed:"+this.minSpeed);
		System.out.println("fuelCapacity:"+this.fuelCapacity);
		System.out.println("sonarSystem:"+this.sonarSystem);
		System.out.println("communicationSystem:"+this.communicationSystem);
		System.out.println("foodStorageCapacity:"+this.foodStorageCapacity);
		System.out.println("lifeSupportSystems:"+this.lifeSupportSystems);
		System.out.println("divingPlanes:"+this.divingPlanes);
		System.out.println("mineLayingCapacity:"+this.mineLayingCapacity);
		System.out.println("crewCapacity:"+this.crewCapacity);
		System.out.println("emergencyEscapeSystem:"+this.emergencyEscapeSystem);
	}

}
