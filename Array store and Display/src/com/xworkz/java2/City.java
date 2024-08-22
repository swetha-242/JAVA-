package com.xworkz.java2;

public class City {
	
	private String[] cityNames = new String[7];
	private int index = 0;

	public void storeCityName(String cityName) {

		cityNames[index] = cityName;
		index++;

	}

	public void displayCityNames() {
		for (String cityName :cityNames) {
			System.out.println("city names listed are: " + cityName);
		}
	}

}
