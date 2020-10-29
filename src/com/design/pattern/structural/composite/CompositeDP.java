package com.design.pattern.structural.composite;

public class CompositeDP {
    public static void main(String[] args) {

        Component hd = new Leaf(40000, "HDD");
        Component mouse = new Leaf(400, "Mouse");
        Component monitor = new Leaf(40, "Monitor");
        Component cpu = new Leaf(8000, "CPU");
        Component ram = new Leaf(4000, "Ram");

        Composite ph = new Composite("Peri");
        Composite cabinate = new Composite("Cabinate");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinate.addComponent(hd);
        cabinate.addComponent(mb);

        computer.addComponent(cabinate);
        computer.addComponent(ph);

        // ram.showPrice();
        computer.showPrice();

    }
}
