package com.sbt.javaschool.homework2;
public class Test {
    public static void main(String[] args) {
        Person a = new Person(true,"Sergey");
        Person b = new Person(false,"Julia");
        Person c = new Person(false,"Marry");
        System.out.println(a.marry(c));
       System.out.println(a.marry(b));

    }
}
