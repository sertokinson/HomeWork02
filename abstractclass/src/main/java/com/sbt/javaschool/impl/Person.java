package com.sbt.javaschool.impl;


import com.sbt.javaschool.api.Human;

public abstract class Person implements Human {

    private final String name;
    private final int age;

    public String getName() { return name; }
    public int getAge() { return age; }

    public Person(String name, int age){

            this.name=name;
            this.age=age;
    }

    public abstract void displayInfo();
}