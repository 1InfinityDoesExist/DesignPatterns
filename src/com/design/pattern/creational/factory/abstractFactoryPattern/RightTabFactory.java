package com.design.pattern.creational.factory.abstractFactoryPattern;

public class RightTabFactory implements TabFactory {
	
	@Override
	public Tab create() {
		return new RightTab() ;
	}
}
