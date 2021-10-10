package com.design.pattern.creational.singletone_1;

public class Singleton1 {

	private static Singleton1 SINGLETON = null;

	private Singleton1() {
		super();
	}

	public static Singleton1 getInstance() {
		if (SINGLETON == null) {
			SINGLETON = new Singleton1();
		}
		return SINGLETON;
	}

}
