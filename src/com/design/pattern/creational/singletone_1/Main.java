package com.design.pattern.creational.singletone_1;

public class Main {
	public static void main(String[] args) {

		Singleton1 s1 = Singleton1.getInstance();

		Singleton1 s2 = Singleton1.getInstance();

		System.out.println(s1);
		System.out.println(s2);

	}
}
