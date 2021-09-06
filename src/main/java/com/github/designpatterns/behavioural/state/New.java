package com.github.designpatterns.behavioural.state;

public class New implements OrderState {

    @Override
    public double handleCancel() {
        System.out.println("It's a new order. No processing done");
        return 0;
    }
}
