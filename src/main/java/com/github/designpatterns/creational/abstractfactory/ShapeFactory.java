package com.github.designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    // Not following segregation, but this is just an example
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
