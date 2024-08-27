package com.java.inheritence.Runner;

import com.java.inheritence.*;

public class InheritenceAllProRunner {

	public static void main(String[] args) {
		 
		Bulb bulb=new Light();
		bulb.brand="fiillipse";
		bulb.glow();
        System.out.println("----------------------------------------");
        
        Halwa halwa1=new Sweet();
        halwa1.name="Peda";
        halwa1.price=50;
        halwa1.taste=true;
        halwa1.expression();
        System.out.println("----------------------------------------");
        
        SmartPhone smartphone=new Gadget();
        smartphone.brand="OPPO A9";
        smartphone.price=18000;
        smartphone.color="white";
        smartphone.cameraQuality=true;
        SmartPhone smartphone1=new Gadget();
        smartphone.Display();
        smartphone1.brand="SAMSUNG";
        smartphone1.price=250000;
        smartphone1.Display();
        SmartPhone smartphone2=new Gadget();
        smartphone2.color="Grey";
        smartphone2.Display();	
        System.out.println("----------------------------------------");
        
        Bull bull1=new Animal();
		bull1.type="Black bull";
		bull1.price=20000;
		bull1.gender="feMale";
		bull1.noOfBulls=100;
		bull1.use="race";
		bull1.fighting();
		System.out.println("--------------------------------------------");
		
		Chicken chicken1=new Food();
		chicken1.type="chicken tikka";
		chicken1.price=500250;
		chicken1.gender="male";
		chicken1.quantity=2;
		chicken1.use="health-promoting nutrients";
		chicken1.breed="local";
		chicken1.lifespan=120;
		chicken1.rank="Species";
		chicken1.quality="good";
		chicken1.color="green";
		chicken1.Nonveg();
		System.out.println("--------------------------------------------");
	}

}
