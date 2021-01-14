package com.decorator;

public class AlarmDecorator extends BikeDecorator {

	protected Bike bike;

	public AlarmDecorator(Bike bike) {
		super(bike);
		this.bike = bike;

	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Added alarm to " + getName() + " is : " + getPrice());
	}

	@Override
	public String addNewFeatureName() {
		// TODO Auto-generated method stub
		return "Alarm";

	}

	@Override
	public int addNewFeaturePrice() {
		// TODO Auto-generated method stub
		return 18000;
	}

}
