package com.github.designpatterns.creational.builder;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserDTO {

    private String name;
    private String address;
    private String age;
    private LocalDateTime createdOn;

    private UserDTO() {
    }

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

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", createdOn=" + createdOn +
                '}';
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

    public static UserDTOBuilder builder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {

        private String name;
        private String address;
        private String age;
        private LocalDateTime createdOn;

        public UserDTOBuilder withFirstName(String name) {
            this.name = name;
            return this;
        }

        public UserDTOBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public UserDTOBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public UserDTOBuilder withCreationTime(LocalDateTime dateTime) {
            this.createdOn = dateTime;
            return this;
        }

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.setName(this.name);
            userDTO.setAddress(this.address);
            userDTO.setAge(this.age);

            userDTO.setCreatedOn(Objects.requireNonNullElseGet(this.createdOn, LocalDateTime::now));
            return userDTO;
        }
    }
}
