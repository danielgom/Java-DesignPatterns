package com.github.designpatterns.creational.factory.concrete;

public class ShapeFactory implements ShapeFactoryInterface {
    // We can add a static method in here with an enum
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
