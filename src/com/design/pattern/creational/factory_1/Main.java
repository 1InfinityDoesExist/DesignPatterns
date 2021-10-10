package com.design.pattern.creational.factory_1;

public class Main {

	public static void main(String[] args) {
		Vehicle car = CarFactory.create();

		System.out.println(car);
	}
}
