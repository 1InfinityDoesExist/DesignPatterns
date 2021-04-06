package com.design.pattern.behavioral.strategy;

public class Test {
	public static void main(String[] args) {
		Animal sparky = new Dog();

		Animal tweety = new Bird();
		System.out.println(sparky.tryToFly());
		sparky.setFlyingAbility(new ItFly());
		System.out.println(sparky.tryToFly());
		System.out.println(tweety.tryToFly());
	}

}
