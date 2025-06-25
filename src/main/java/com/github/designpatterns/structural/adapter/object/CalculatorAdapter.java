package com.github.designpatterns.structural.adapter.object;

public class CalculatorAdapter implements CalculatorI {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rectangle = new Rectangle(triangle.base(), 0.5 * triangle.height());

        return calculator.getArea(rectangle);
    }
}
