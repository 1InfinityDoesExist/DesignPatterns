package com.design.pattern.behavioral.iterator;

public class Container implements Iterator {

	private int cursor = -1;
	private int[] values;

	public Container(int[] values) {
		this.values = values;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor < values.length - 1;
	}

	@Override
	public Integer next() {
		if (hasNext()) {
			cursor++;
			return values[cursor];
		}
		return null;

	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return values[cursor];
	}

	@Override
	public boolean hasPrvious() {
		// TODO Auto-generated method stub
		return cursor < 1;
	}

	@Override
	public Integer previous() {
		if (hasPrvious()) {
			cursor--;
			return values[cursor];
		}
		return null;
	}
}
