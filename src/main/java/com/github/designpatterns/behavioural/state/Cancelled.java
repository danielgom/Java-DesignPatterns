package com.github.designpatterns.behavioural.state;

public class Cancelled implements OrderState {

    @Override
    public double handleCancel() {
        throw new IllegalStateException("Trying to cancel an already cancelled order");
    }
}
