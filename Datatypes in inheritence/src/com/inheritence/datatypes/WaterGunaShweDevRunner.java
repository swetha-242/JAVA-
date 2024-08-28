package com.inheritence.datatypes;

import com.inheritence.datatypes.things.Devu;
import com.inheritence.datatypes.things.Gunashree;
import com.inheritence.datatypes.things.Shwetha;
import com.inheritence.datatypes.things.WaterBottle;

public class WaterGunaShweDevRunner {

	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.buy();
		
		Shwetha shwetha=new Shwetha();
		WaterBottle waterBottle=new WaterBottle();
		shwetha.open(waterBottle);
		
		Devu devu=new Devu();
		WaterBottle waterBottle1=new WaterBottle();
        devu.waterBottle=waterBottle1;
        devu.drink();
	}

}
