package com.design.pattern.creational.factory.abstractFactoryPattern;

public class MainClass {
	public static void main(String[] args) {
		Tab leftTab = new LeftTabFactory().create();
		Tab rightTab = new RightTabFactory().create();
		System.out.println(leftTab.toString());
	}

}
