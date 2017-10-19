package com.sbt.javaschool.impl;

import com.sbt.javaschool.api.Human;

class Employee extends Person implements Human {

    private final String bankName;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.bankName = company;
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + "," + " Возраст: "
                + super.getAge() + "," + " Работает в банке: " + bankName);
    }
}