package com.design.pattern.behavioral.strategy;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double spped;
	private String sound;

	public Flys flyingType; // Composition

	public String tryToFly() {
		return flyingType.fly();
	}

	public void setFlyingAbility(Flys newFlyType) {
		this.flyingType = newFlyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public double getSpped() {
		return spped;
	}

	public void setSpped(double spped) {
		this.spped = spped;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
