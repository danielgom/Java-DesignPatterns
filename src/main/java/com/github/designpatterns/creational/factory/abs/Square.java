package com.github.designpatterns.creational.factory.abs;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
