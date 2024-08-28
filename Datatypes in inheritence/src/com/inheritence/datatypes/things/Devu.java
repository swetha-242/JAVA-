package com.inheritence.datatypes.things;

public class Devu {
	
	public WaterBottle waterBottle;
	
	public void drink()
	{
		if(waterBottle!=null)
		{
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.quantity+" "+waterBottle.color);
		}
		else
		{
			System.out.println("watterbottle is null");
		}
	}

}
