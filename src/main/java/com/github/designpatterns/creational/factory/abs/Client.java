package com.github.designpatterns.creational.factory.abs;

public class Client {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        Shape circleShape = circleFactory.getShape();
        circleShape.draw();

        Shape myOtherCircle = circleFactory.getShape();
        myOtherCircle.draw();

        new SquareFactory().getShape().draw();
    }
}
