package com.github.designpatterns.structural.bridge;

public class Car extends Vehicle {
    public Car(Workshop workshop, Workshop workshop2) {
        super(workshop, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufactured car");
        workshop.work();
        workshop2.work();
    }
}
