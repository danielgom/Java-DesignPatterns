package com.github.designpatterns.creational.abstractfactory;

public class FactoryProducer {
    private FactoryProducer() {
    }

    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
