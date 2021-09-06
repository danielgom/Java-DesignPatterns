package com.github.designpatterns.behavioural.state;

public class Client {

    public static void main(String[] args) {

        Order order = new Order();
        order.cancel();

        order.paymentSuccessful();
        order.cancel();

        order.dispatched();
        order.cancel();

        order.delivered();
        order.cancel();
    }
}
