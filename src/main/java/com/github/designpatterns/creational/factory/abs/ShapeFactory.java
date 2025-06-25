package com.github.designpatterns.creational.factory.abs;

public abstract class ShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
