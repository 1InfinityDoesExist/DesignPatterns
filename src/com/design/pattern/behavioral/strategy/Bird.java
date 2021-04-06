package com.design.pattern.behavioral.strategy;

public class Bird extends Animal {

	public Bird() {
		super();
		flyingType = new ItFly();
	}

}
