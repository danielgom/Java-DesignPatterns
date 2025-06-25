package com.github.designpatterns.creational.factory.abs;

public class CircleFactory extends ShapeFactory {
    protected Shape factoryMethod() {
        return new Circle();
    }
}
