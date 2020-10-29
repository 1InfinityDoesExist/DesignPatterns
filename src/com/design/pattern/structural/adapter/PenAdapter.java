package com.design.pattern.structural.adapter;

public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        // TODO Auto-generated method stub
        pp.mark(str);
    }

}
