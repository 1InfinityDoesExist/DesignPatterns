package com.design.pattern.structural.decorator;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza tempPizza;

	public ToppingDecorator(Pizza newPizza) {
		// TODO Auto-generated constructor stub
		this.tempPizza = newPizza;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.tempPizza.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.tempPizza.getDescription();
	}
}
