package com.decorator;

public abstract class BikeDecorator extends Bike {

	protected Bike bike;

	public BikeDecorator(Bike bike) {
		this.bike = bike;
		setName(bike.getName() + " " + addNewFeatureName());
		setPrice(bike.getPrice() + addNewFeaturePrice());
	}

	@Override
	public void showDetails() {
		bike.showDetails();
		System.out.println("Cost of " + getName() + " is : " + getPrice());

	}

	public abstract String addNewFeatureName();

	public abstract int addNewFeaturePrice();
}
