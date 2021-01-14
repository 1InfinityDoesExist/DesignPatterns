package com.design.pattern.creational.singleton;

//per JVM object is created
public class SingletonDemo {

	private static volatile SingletonDemo singletonDemo; // = new SingletonDemo();

	// 1st Issue : object creation is possible via reflection api if left as it
	// is...
	private SingletonDemo() {
		// overcome issue
		if (singletonDemo != null) {
			throw new RuntimeException("Go get your own object");
		}
	}

	// 2nd Issue : threading -- multiple object can be created
	public static SingletonDemo getInstance() {
		// overcome issue
		if (singletonDemo == null) { // other threads don't can return from here as well, no need to enter the sync
			synchronized (SingletonDemo.class) {
				if (singletonDemo == null) {
					singletonDemo = new SingletonDemo();
				}
			}
		}
		return singletonDemo;
	}
}
