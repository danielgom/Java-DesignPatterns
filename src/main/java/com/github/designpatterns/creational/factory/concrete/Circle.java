package com.github.designpatterns.creational.factory.concrete;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle concrete");
    }
}
