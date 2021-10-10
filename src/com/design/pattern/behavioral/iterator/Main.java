package com.design.pattern.behavioral.iterator;

public class Main {
	public static void main(String[] args) {

		int[] values = new int[] { 1, 2, 3, 4, 5 };
		Container container = new Container(values);
		while (container.hasNext()) {
			Integer c = container.next();
			System.out.println(c);
		}

	}
}
