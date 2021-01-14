package com.decorator;

public class Test {
	public static void main(String[] args) {

//		MountainBike mountainBike = new MountainBike("Hero");
//		mountainBike.showDetails();
//
//		RoadBike roadBike = new RoadBike("Pulser");
//		roadBike.showDetails();

		Bike bike = new AlarmDecorator(new RoadBike("hero"));
		bike.showDetails();
	}
}
