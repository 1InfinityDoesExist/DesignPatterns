package com.design.pattern.creational.singletone_1;

public class Singleton4 {

	private Singleton4() {
		super();
	}

	private static final class SingletonHolder {
		private static final Singleton4 SINGLETON = new Singleton4();
	}

	public static Singleton4 getInstance() {

		return SingletonHolder.SINGLETON;
	}
}
