package com.design.pattern.creational.singletone_1;

public class Singleton3 {

	private static Singleton3 SINGLETON3 = null;

	private Singleton3() {
		super();
	}

	public static Singleton3 getInstance() {
		if (SINGLETON3 == null) {
			synchronized (Singleton3.class) {
				if (SINGLETON3 == null) {
					SINGLETON3 = new Singleton3();
				}
			}
		}
		return SINGLETON3;
	}
}
