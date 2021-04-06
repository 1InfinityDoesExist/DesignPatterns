package com.design.pattern.structural.decorator;

/**
 * A Decorator Pattern says that just "attach a flexible additional
 * responsibilities to an object dynamically".
 * 
 * In other words, The Decorator Pattern uses composition instead of inheritance
 * to extend the functionality of an object at runtime.
 * 
 * @author 1518
 *
 */
public class TestClass {
	public static void main(String[] args) {

		Pizza basicPizza = new Mozzarella(new PlainPizza());
		System.out.println(basicPizza.getCost() + " : " + basicPizza.getDescription());

	}

}
