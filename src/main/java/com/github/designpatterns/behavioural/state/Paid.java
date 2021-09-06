package com.github.designpatterns.behavioural.state;

public class Paid implements OrderState {

    @Override
    public double handleCancel() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }
}
