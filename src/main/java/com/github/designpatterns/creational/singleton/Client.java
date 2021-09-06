package com.github.designpatterns.creational.singleton;

public class Client {

    public static void main(String[] args) {

        // Eager
        //EagerRegistry instance = EagerRegistry.getInstance();
        //EagerRegistry instance1 = EagerRegistry.getInstance();
        EagerRegistry sin;
        //System.out.println(instance1);

        System.out.println();
        System.out.println();

        // LazyRegistryWithDCL
        LazyRegistryWithDCL lazy1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazy2 = LazyRegistryWithDCL.getInstance();

        System.out.println(lazy1);
        System.out.println(lazy2);

        System.out.println(lazy1 == lazy2);

        // LazyRegistryIODH

        LazyRegistryIODH singleton;
        LazyRegistryIODH instance = LazyRegistryIODH.getInstance();


    }
}
