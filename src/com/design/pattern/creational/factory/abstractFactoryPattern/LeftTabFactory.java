package com.design.pattern.creational.factory.abstractFactoryPattern;

public class LeftTabFactory implements TabFactory {
	@Override
	public Tab create() {
		return new LeftTab() ;
	}
}
