package com.github.designpatterns.creational.builder;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserDTO {

    private String name;

    private String address;

    private String age;

    private LocalDateTime createdOn;

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    private UserDTO(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.createdOn = Objects.requireNonNullElseGet(builder.createdOn, LocalDateTime::now);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(name, userDTO.name) && Objects.equals(address, userDTO.address) &&
                Objects.equals(age, userDTO.age) && Objects.equals(createdOn, userDTO.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, age, createdOn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String address;
        private String age;
        private LocalDateTime createdOn;

        public Builder withFirstName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withAge(String age) {
            this.age = age;
            return this;
        }

        public Builder withCreationTime(LocalDateTime dateTime) {
            this.createdOn = dateTime;
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }
}
