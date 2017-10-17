package com.sbt.javaschool.api;

public interface Person {
    boolean marry(Person person);

    boolean isMan();

    String getName();

    Person getSpouse();

    boolean divorce();

    void setSpouse(Person spouse);
}
