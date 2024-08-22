package com.xworkz.java2;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet=new Sweet();
		
		sweet.storeSweetName("champakali");
		sweet.storeSweetName("Rasgulla");
		sweet.storeSweetName("Rasmalai");
		sweet.storeSweetName("Mothi Chor");
		sweet.storeSweetName("Carrot Halwa");
		sweet.storeSweetName("Kaju Barfi");
		sweet.storeSweetName("Mysore Paak");
		
		sweet.displaySweetNames();
	}
}
