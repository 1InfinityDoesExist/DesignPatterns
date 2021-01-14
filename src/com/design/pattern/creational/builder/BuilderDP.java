package com.design.pattern.creational.builder;

public class BuilderDP {
	public static void main(String[] args) {
		Phone phone = new Phone.PhoneBuilder().setBattery(5200).setOs("IOS").getPhone();
		System.out.println(phone);
	}
}
