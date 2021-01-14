package com.design.pattern.creational.factoryMethod;

public abstract class Database {

	String userName, driverName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void showConnectionDetails() {
		System.out.println("Driver Name : " + getDriverName());
		System.out.println("User Name : " + getUserName());
	}

}
