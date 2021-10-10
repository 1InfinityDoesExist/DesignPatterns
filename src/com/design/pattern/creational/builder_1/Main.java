package com.design.pattern.creational.builder_1;

public class Main {

	public static void main(String[] args) {

		Product p1 = Product.builder().id(100).name("Avinash Patel").build();

		System.out.println(p1.toString());
	}

}
