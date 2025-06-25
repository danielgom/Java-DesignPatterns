package com.github.designpatterns.creational.builder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserDTO daniel = UserDTO.builder()
                .withFirstName("Daniel")
                .withAge("25")
                .withAddress("Fuente de medusa 44")
                .build();

        System.out.println(daniel);

        UserDTORecord myRecord = UserDTORecord.builder()
                .withName("Daniel")
                .withAddress("Fuente de medusa 44")
                .withAge(25)
                .withCreatedAt(LocalDateTime.now())
                .build();

        System.out.println(myRecord);
    }
}
