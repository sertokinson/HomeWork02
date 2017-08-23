package com.sbt.javaschool.workYuri;
abstract class Person implements Human {
    String name;
    int age;
    double budget;
    abstract double countSalary();
    public void getName(){
        System.out.println(this.name);
    }
    public void getAge(){
        System.out.println(this.age);
    }
    public void salary(){
        System.out.println(countSalary());
    }
}
