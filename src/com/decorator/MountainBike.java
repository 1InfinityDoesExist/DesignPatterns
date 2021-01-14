package com.decorator;

public class MountainBike extends Bike {

	@Override
	public void showDetails() {
		System.out.println("Montain bike price is : " + getPrice());

	}

	public MountainBike(String name) {
		super(name);
		setPrice(2000);
	}

}
