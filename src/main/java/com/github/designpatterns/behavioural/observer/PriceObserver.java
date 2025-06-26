package com.github.designpatterns.behavioural.observer;

// Concrete observer
public class PriceObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        double total = order.getItemCost();

        if (total >= 500) {
            order.setDiscount(400);
        } else if (total >= 200) {
            order.setDiscount(10);
        }
        System.out.println("Price updated");
    }
}
