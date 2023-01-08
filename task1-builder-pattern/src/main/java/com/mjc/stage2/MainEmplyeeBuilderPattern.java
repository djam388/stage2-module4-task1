package com.mjc.stage2;

public class MainEmplyeeBuilderPattern {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .setCarNumber("01AA001A")
                .setEmail("employee@mail.employee")
                .setLastName("lastNameEmployee")
                .setName("firstNameEmployee")
                .setPhone("123456789")
                .setPosition("Sales manager")
                .build();

        System.out.println(employee);

    }
}
