package com.design.pattern.creational.singletone_1;

/**
 * Eager
 * 
 * @author mossad
 *
 */
public class Singleton5 {

	private static Singleton5 SINGLETON = new Singleton5();

	private Singleton5() {
		super();
	}

	public static Singleton5 getInstance() {

		return SINGLETON;
	}
}
