package com.github.designpatterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Produce(), new Assemble());
        vehicle.manufacture();

        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }
}
