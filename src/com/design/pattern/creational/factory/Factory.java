package com.design.pattern.creational.factory;

public class Factory {
    public OS buidOS(String phone) {
        if (phone.equalsIgnoreCase("IPhone")) {
            return new IPhone();
        } else if (phone.equalsIgnoreCase("Nokia")) {
            return new Nokia();
        } else {
            return new Samgsunj();
        }
    }
}
