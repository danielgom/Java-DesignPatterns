package com.github.designpatterns.creational.abstractfactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
