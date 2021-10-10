package com.design.pattern.behavioral.iterator;

public interface Iterator {

	boolean hasNext();

	Integer next();

	int get();

	boolean hasPrvious();

	Integer previous();
}
