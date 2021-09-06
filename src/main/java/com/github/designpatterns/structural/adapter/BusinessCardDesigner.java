package com.github.designpatterns.structural.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        return customer.getName() +
                "\n" +
                customer.getDestination() +
                "\n" +
                customer.getAddress();
    }
}
