package com.inheritence.datatypes.things;

public class Shwetha {
	
	public void open(WaterBottle watterBottle)
	{
		if(watterBottle!=null)
		{
			watterBottle.fill();
			watterBottle.empty();
			watterBottle.crush();
			System.out.println(watterBottle.quantity+" "+watterBottle.color);
		}
		else
		{
			System.out.println("watterbottle is null");
		}
	}

}
