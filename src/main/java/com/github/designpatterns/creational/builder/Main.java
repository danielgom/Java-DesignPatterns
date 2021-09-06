package com.github.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        UserDTO daniel = UserDTO.builder()
                .withFirstName("Daniel")
                .withAge("25")
                .withAddress("Fuente de medusa 44")
                .build();

        System.out.println(daniel);
    }
}
