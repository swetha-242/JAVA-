package com.inheritence.datatypes;

import com.inheritence.datatypes.things.Divya;
import com.inheritence.datatypes.things.Harshitha;
import com.inheritence.datatypes.things.Omkar;
import com.inheritence.datatypes.things.Shoe;

public class ShoDivOmHarshRunner {

	public static void main(String[] args) {
		
		Divya divya=new Divya();
		divya.wear();
		
		Omkar omkar=new Omkar();
		Shoe shoe=new Shoe();
		omkar.buy(shoe);
		
		Harshitha harshitha=new Harshitha();
		Shoe shoe1=new Shoe();
		harshitha.shoe=shoe1;
		harshitha.pack();
	}
}
