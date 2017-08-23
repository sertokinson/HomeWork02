package com.sbt.javaschool.workYuri;

public class test {
    public static void main(String[] args) {
        Client1 a = new Client1();
        Client2 b = new Client2();
        a.name="Sergo";
        a.age=22;
        b.name="Ylia";
        b.age=19;
        a.budget=10000;
        b.budget=20000;
        a.salary();
        b.salary();
    }
}
