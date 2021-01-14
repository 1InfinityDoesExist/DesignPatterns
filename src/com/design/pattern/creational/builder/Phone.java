package com.design.pattern.creational.builder;

/*
 * Builder Design Pattern CDP
 */
public class Phone {

	private String os;
	private String processor;
	private double screenSize;
	private int battery;
	private int camera;
	private int ram;

	public String getOs() {
		return this.os;
	}

	public String getProcessor() {
		return this.processor;
	}

	public double getScreenSize() {
		return this.screenSize;
	}

	public int getBattery() {
		return this.battery;
	}

	public int getCamera() {
		return this.camera;
	}

	public int getRam() {
		return this.ram;
	}

	private Phone(PhoneBuilder phoneBuilder) {
		super();
		this.os = phoneBuilder.os;
		this.processor = phoneBuilder.processor;
		this.screenSize = phoneBuilder.screenSize;
		this.battery = phoneBuilder.battery;
		this.camera = phoneBuilder.camera;
		this.ram = phoneBuilder.ram;
	}

	public static class PhoneBuilder {
		private String os;
		private String processor;
		private double screenSize;
		private int battery;
		private int camera;
		private int ram;

		// Setters with Return Type as PhoneBuilder
		public PhoneBuilder setOs(String os) {
			this.os = os;
			return this;
		}

		public PhoneBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}

		public PhoneBuilder setSreenSize(double screenSize) {
			this.screenSize = screenSize;
			return this;
		}

		public PhoneBuilder setCamera(int camera) {
			this.camera = camera;
			return this;
		}

		public PhoneBuilder setBattery(int battery) {
			this.battery = battery;
			return this;
		}

		public PhoneBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}

		// Method to get Phone Object
		public Phone getPhone() {
			return new Phone(this);
		}

	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", camera=" + camera + ", ram=" + ram + "]";
	}

}
