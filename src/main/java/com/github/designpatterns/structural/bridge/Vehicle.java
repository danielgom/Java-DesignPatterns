package com.github.designpatterns.structural.bridge;

public abstract class Vehicle {
    protected Workshop workshop;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop, Workshop workshop2) {
        this.workshop = workshop;
        this.workshop2 = workshop2;
    }

    public abstract void manufacture();
}
