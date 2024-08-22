package com.xworkz.java2;

public class RiverRunner {

	public static void main(String[] args) {
		
		River river=new River();
		
		river.storeRiverName("Thunga");
		river.storeRiverName("Badra");
		river.storeRiverName("Yamuna");
		river.storeRiverName("Godavari");
		river.storeRiverName("Sindu");
		river.storeRiverName("Kaveri");
		river.storeRiverName("Ganga");

		river.displayRiverNames();
	}

}
