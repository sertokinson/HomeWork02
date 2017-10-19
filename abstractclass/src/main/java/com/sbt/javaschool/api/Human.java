package com.sbt.javaschool.api;

public interface Human {

    /**
     * Returns <tt>name</tt>
     *
     * @return <tt>name</tt>
     */
    String getName();

    /**
     * Returns <tt>age</tt>
     *
     * @return <tt>age</tt>
     */
    int getAge();
    /**
     * Print: "Имя: <tt>name</tt>,  Возраст: <tt>age</tt>,  Работает в банке: <tt>bankName</tt>"
     *
     */
    void displayInfo();

}

