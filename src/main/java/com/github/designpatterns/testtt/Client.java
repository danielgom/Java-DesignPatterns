package com.github.designpatterns.testtt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.time.LocalDateTime;

public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setAge(22);
        customer.setAvailableZones("Mexico_City,Los_Angeles");
        customer.setCreatedOn(LocalDateTime.now());
        customer.setFirstName("Daniel");
        customer.setLastName("Gomez");

        System.out.println(customer);

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.findAndRegisterModules();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        try {
            System.out.println(objectMapper.writeValueAsString(customer));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
