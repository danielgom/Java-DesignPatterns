package com.github.designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {

        // Two-way adapter
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();

        // Works as an employee (as expected)
        populateEmployeeData(employeeClassAdapter);

        // New client code
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();

        // Works as a businessCardDesigner
        String card = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println(card);

        // Using object adapter (recommended)
        Employee employee = new Employee();
        populateEmployeeData(employee);

        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);

        BusinessCardDesigner businessCardDesigner1 = new BusinessCardDesigner();

        String card1 = businessCardDesigner1.designCard(employeeObjectAdapter);

        System.out.println(card1);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Daniel Gomez");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Digital OnUs");
    }
}
