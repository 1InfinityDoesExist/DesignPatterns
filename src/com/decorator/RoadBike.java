package com.decorator;

public class RoadBike extends Bike {

	@Override
	public void showDetails() {
		System.out.println("Road bike price is ::::: " + getPrice());

	}

	public RoadBike(String name) {
		super(name);
		setPrice(2000000);
	}

}