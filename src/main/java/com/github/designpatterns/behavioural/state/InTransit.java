package com.github.designpatterns.behavioural.state;

public class InTransit implements OrderState {

    @Override
    public double handleCancel() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting gateway for transaction rollback");
        return 20;
    }
}
