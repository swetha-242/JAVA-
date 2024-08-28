package com.java.inheritence.Runner;

import com.java.inheritence.Animal;
import com.java.inheritence.Bulb;
import com.java.inheritence.Bull;
import com.java.inheritence.Chicken;
import com.java.inheritence.Food;
import com.java.inheritence.Gadget;
import com.java.inheritence.Halwa;
import com.java.inheritence.Light;
import com.java.inheritence.SmartPhone;
import com.java.inheritence.Sweet;

public class InheritenceAllProRunner1 {

	public static void main(String[] args) {
		
		Bulb bulb=new Light();//parent to child--> Parent is Bulb child is Light
		bulb.brand="fiillipse";
		bulb.glow();
        
        Bulb bulb1=new Bulb();
        bulb1.brand="Epson";
		bulb1.glow();
        System.out.println("----------------------------------------");
        
        
        Halwa halwa1=new Sweet();
        halwa1.name="mysore pack";
        halwa1.price=20;
        halwa1.taste=false;
        halwa1.expression();
        
        Halwa halwa2=new Halwa();
        halwa2.name="Peda";
        halwa2.price=50;
        halwa2.taste=true;
        halwa2.expression();
        System.out.println("----------------------------------------");
        
        SmartPhone smartphone=new Gadget();
        smartphone.brand="OPPO A9";
        smartphone.price=18000;
        smartphone.color="white";
        smartphone.cameraQuality=true;
        SmartPhone smartphone1=new SmartPhone();
        smartphone.Display();
        smartphone1.brand="SAMSUNG";
        smartphone1.price=250000;
        smartphone1.Display();	
        System.out.println("----------------------------------------");
        
        Bull bull1=new Animal();
		bull1.type="Black bull";
		bull1.price=20000;
		bull1.gender="feMale";
		bull1.noOfBulls=100;
		bull1.use="race";
		bull1.fighting();
		    Bull bull2=new Bull();
			bull2.type="white bull";
			bull2.price=10000;
			bull2.gender="Male";
			bull2.noOfBulls=30;
			bull2.use="Milk";
			bull2.fighting();
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
		Chicken chicken2=new Food();
		chicken2.type="chicken 65";
		chicken2.price=500250;
		chicken2.gender="female";
		chicken2.quantity=5;
		chicken2.use="health-promoting nutrients";
		chicken2.breed="hybrd";
		chicken2.lifespan=100;
		chicken2.rank="Species";
		chicken2.quality="best";
		chicken2.color="red";
		chicken2.Nonveg();
		System.out.println("--------------------------------------------");
	}


	}
