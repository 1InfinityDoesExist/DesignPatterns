package com.design.pattern.structural.adapter;

public class School {
    public static void main(String[] args) {

        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.writeAssignment("Destroy the system that created it");
    }
}
