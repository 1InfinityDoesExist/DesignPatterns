package com.design.pattern.creational.builder_1;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String name;
	private BigDecimal price;
	private String color;
}
