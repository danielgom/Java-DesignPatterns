package com.github.designpatterns.creational.builder;

import java.time.LocalDateTime;

public record UserDTORecord(String name, String address, int age, LocalDateTime createdAt) {
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        private String address;

        private int age;

        private LocalDateTime createdAt;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public UserDTORecord build() {
            return new UserDTORecord(name, address, age, createdAt);
        }
    }
}
