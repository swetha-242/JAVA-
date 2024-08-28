package com.inheritence.datatypes.things;

public class Gunashree {
	
	public void buy()
	{
		WaterBottle waterBottle=new WaterBottle();
		waterBottle.fill();
		waterBottle.empty();
		waterBottle.crush();
		System.out.println(waterBottle.quantity+" "+waterBottle.color);
	}

}
