package com.github.designpatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color blueColor = colorFactory.getColor("Blue");
        blueColor.fill();

        Color redColor = colorFactory.getColor("Red");
        redColor.fill();
    }
}
