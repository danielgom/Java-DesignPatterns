package com.github.designpatterns.behavioural.observer;

import java.util.HashSet;
import java.util.Set;

// Concrete object
public class Order {

    private String id;

    private double itemCost;

    private int count;

    private double discount;

    private double shippingCost;

    private Set<OrderObserver> observers = new HashSet<>();

    public void attach(OrderObserver orderObserver) {
        observers.add(orderObserver);
    }

    public void detach(OrderObserver orderObserver) {
        observers.remove(orderObserver);
    }

    public Order(String id) {
        this.id = id;
    }

    public double getTotal() {
        return this.itemCost - this.discount + this.shippingCost;
    }

    public void addItem(double price) {
        this.itemCost += price;
        count++;
        observers.forEach(observer -> observer.updated(this));
    }

    public int getCount() {
        return count;
    }

    public double getItemCost() {
        return itemCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<OrderObserver> getObservers() {
        return observers;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
