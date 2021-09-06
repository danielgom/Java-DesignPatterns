package com.github.designpatterns.structural.adapter;

// Object adapter, do not extend Customer
public record EmployeeObjectAdapter(
        Employee employee) implements Customer {

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDestination() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
