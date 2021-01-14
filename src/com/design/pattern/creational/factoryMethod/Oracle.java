package com.design.pattern.creational.factoryMethod;

public class Oracle extends Database {
	public Oracle() {
		setDriverName("oracle.jdbc.driver.OracleConnector");
		setUserName("oracle@123");
	}
}
