package com.design.pattern.creational.factoryMethod;

public class DatabaseFactory {

	public DatabaseFactory() throws Exception {
		throw new IllegalAccessException("No allowed");
	}

	public static Database createDatabaseObject(DatabaseType type) {
		switch (type) {
		case MYSQL:
			return new MySql();
		case ORACLE:
			return new Oracle();
		default:
			return null;
		}
	}
}
