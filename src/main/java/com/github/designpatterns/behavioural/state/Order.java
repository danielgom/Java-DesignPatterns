package com.github.designpatterns.behavioural.state;

// Context class
public class Order {

    private OrderState currentState;

    public Order() {
        this.currentState = new New();
    }

    public double cancel() {
        double charges = currentState.handleCancel();
        this.currentState = new Cancelled();
        return charges;
    }

    public void paymentSuccessful() {
        this.currentState = new Paid();
    }

    public void dispatched() {
        this.currentState = new InTransit();
    }

    public void delivered() {
        this.currentState = new Delivered();
    }
}
