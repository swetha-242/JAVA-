package com.xworkz.java2;

public class River {
	
	private String[] riverNames = new String[7];
	private int index = 0;

	public void storeRiverName(String riverName) {

	riverNames[index] = riverName;
		index++;

	}

	public void displayRiverNames() {
		for (String riverName :riverNames) {
			System.out.println("River names listed are: " + riverName);
		}
	}


}
