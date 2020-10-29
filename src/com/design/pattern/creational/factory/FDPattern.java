package com.design.pattern.creational.factory;

public class FDPattern {

    public static void main(String[] args) {
        Factory factory = new Factory();
        OS os = factory.buidOS("nokia");
        os.printOsUsed();
    }

}
