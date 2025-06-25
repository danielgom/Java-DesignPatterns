package com.github.designpatterns.creational.factory.concrete;

public class Client {
    public static void main(String[] args) {
        ShapeFactoryInterface shapeFactoryInterface = new ShapeFactory();
        shapeFactoryInterface.getShape("CIRCLE").draw();
    }
}
