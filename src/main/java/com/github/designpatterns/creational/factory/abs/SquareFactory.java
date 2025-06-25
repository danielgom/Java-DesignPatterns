package com.github.designpatterns.creational.factory.abs;

public class SquareFactory extends ShapeFactory {
    protected Shape factoryMethod() {
        return new Square();
    }
}
