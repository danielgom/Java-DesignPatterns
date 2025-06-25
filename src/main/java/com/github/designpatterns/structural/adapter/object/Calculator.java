package com.github.designpatterns.structural.adapter.object;

public class Calculator implements CalculatorI {
    Rectangle rectangle;

    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length() * rectangle.width();
    }
}
