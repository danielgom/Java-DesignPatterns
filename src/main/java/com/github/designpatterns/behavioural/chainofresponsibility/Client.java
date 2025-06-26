package com.github.designpatterns.behavioural.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        DispenseChain dollar50Dispensor = new Dollar50Dispensor();
        DispenseChain dollar20Dispensor = new Dollar20Dispensor();
        DispenseChain dollar10Dispensor = new Dollar10Dispensor();

        dollar50Dispensor.setNextChain(dollar20Dispensor);
        dollar20Dispensor.setNextChain(dollar10Dispensor);

        dollar50Dispensor.dispense(new Currency(80));
    }
}
