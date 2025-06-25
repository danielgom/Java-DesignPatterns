package com.github.designpatterns.structural.bridge;

public class Bike extends Vehicle {
    public Bike(Workshop workshop, Workshop workshop2) {
        super(workshop, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufactured bike");
        workshop.work();
        workshop2.work();
    }
}
