package com.xworkz.java2;

public class BikeRunner {
		public static void main(String[] args) {
			Bike bike = new Bike();

			bike.storeBikeName("Duke ");
			bike.storeBikeName("Ktm");
			bike.storeBikeName("Bullet");
			bike.storeBikeName("honda");
			bike.storeBikeName("pulser ");
			bike.storeBikeName("TVS");
			bike.storeBikeName("Suzuki");

			bike.displayBikeNames();
		}
	}