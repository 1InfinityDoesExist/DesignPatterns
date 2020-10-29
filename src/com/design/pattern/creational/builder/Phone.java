package com.design.pattern.creational.builder;

/*
 * Builder Design Pattern CDP
 */
public class Phone {

    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;
    private int ram;

    public Phone(String os, String processor, double screenSize, int battery, int camera, int ram) {
        super();
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize
                        + ", battery=" + battery + ", camera=" + camera + ", ram=" + ram + "]";
    }


}
