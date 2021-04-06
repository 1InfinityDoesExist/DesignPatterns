package com.design.pattern.behavioral.strategy;

public interface Flys {
	public String fly();

}

class CantFly implements Flys {

	@Override
	public String fly() {
		System.out.println("----I can't fly");
		return "Yes I can not fly";

	}
}

class ItFly implements Flys {

	@Override
	public String fly() {
		System.out.println("----I can fly");
		return "Yes I can fly";

	}

}
