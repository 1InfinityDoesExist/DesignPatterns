package com.design.pattern.creational.builder;

public class PhoneBuilder {
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;
    private int ram;


    // Setters with Return Type as PhoneBuilder
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setSreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    // Method to get Phone Object
    public Phone getPhone() {
        return new Phone(os, processor, screenSize, battery, camera, ram);
    }


}
