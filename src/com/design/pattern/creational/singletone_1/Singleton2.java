package com.design.pattern.creational.singletone_1;

public class Singleton2 {

	private static Singleton2 SINGLETON2 = null;

	private Singleton2() {
		super();
	}

	public static synchronized Singleton2 getInstance() {
		if (SINGLETON2 == null) {
			SINGLETON2 = new Singleton2();
		}
		return SINGLETON2;
	}

}
