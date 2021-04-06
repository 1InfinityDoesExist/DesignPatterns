package com.design.pattern.structural.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Dough");
		System.out.println("Adding mozzarella");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 50.00;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Mozarrela";
	}
}
