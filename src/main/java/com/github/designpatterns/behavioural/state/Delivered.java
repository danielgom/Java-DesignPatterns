package com.github.designpatterns.behavioural.state;

public class Delivered implements OrderState {

    @Override
    public double handleCancel() {
        System.out.println("Contacting courier service for item pickup");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return 30;
    }
}
