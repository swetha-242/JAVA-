package com.xworkz.java2;

public class Dam {
	
	private String[] damNames = new String[7];
	private int index = 0;

	public void storeDamName(String damName) {

	damNames[index] = damName;
		index++;

	}

	public void displayDamNames() {
		for (String damName :damNames) {
			System.out.println("Dam names listed are: " + damName);
		}
	}

}
