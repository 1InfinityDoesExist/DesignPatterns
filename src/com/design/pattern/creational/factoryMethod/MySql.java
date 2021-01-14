package com.design.pattern.creational.factoryMethod;

public class MySql extends Database {

	public MySql() {
		setDriverName("mysql.jdbc.driver.JDBCConnector");
		setUserName("mysql@123");
	}
}
