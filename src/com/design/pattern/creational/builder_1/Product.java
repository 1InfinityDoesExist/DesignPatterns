package com.design.pattern.creational.builder_1;

import java.math.BigDecimal;

public class Product {

	private int id;
	private String name;
	private BigDecimal price;
	private String color;

	// more attribute

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public static class Builder {
		private Product product = new Product();

		public Builder id(int id) {
			product.id = id;
			return this;
		}

		public Builder price(BigDecimal price) {
			product.price = price;
			return this;
		}

		public Builder name(String name) {
			product.name = name;
			return this;
		}

		public Builder color(String color) {
			product.color = color;
			return this;
		}

		public Product build() {
			return product;
		}
	}

	public static Builder builder() {
		return new Builder();
	}
}