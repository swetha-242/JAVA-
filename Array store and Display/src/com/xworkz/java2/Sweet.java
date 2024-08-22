package com.xworkz.java2;

public class Sweet {

		private String[] sweetNames = new String[7];
		private int index = 0;

		public void storeSweetName(String sweetName) {

			sweetNames[index] = sweetName;
			index++;

		}

		public void displaySweetNames() {
			for (String sweetName : sweetNames) {
				System.out.println("Sweet names listed are: " + sweetName);
			}
		}

	}
