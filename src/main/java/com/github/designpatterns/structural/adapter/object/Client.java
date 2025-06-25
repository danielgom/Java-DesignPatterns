package com.github.designpatterns.structural.adapter.object;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 10);
        CalculatorI calculator = new CalculatorAdapter(triangle);
        System.out.println(calculator.getArea(null));
    }
}
