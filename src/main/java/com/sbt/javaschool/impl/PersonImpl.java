package com.sbt.javaschool.impl;


import com.sbt.javaschool.api.Person;

public class PersonImpl implements Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public PersonImpl(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean isMan() {
        return man;
    }

    public String getName() {
        return name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public boolean marry(Person person) {
        if (this.man != person.isMan()) {
            if (this.spouse != null) {
                this.spouse.divorce();
                this.divorce();
            }
            if (person.getSpouse() != null) {
                person.getSpouse().divorce();
                person.divorce();
            }
            this.spouse = person;
            person.setSpouse(this);
            System.out.println("Поженили " + this.name + " и " + person.getName());
            return true;
        }
        System.out.println("Невозможно поженить по закону!");
        return false;
    }

    public boolean divorce() {
        if (this.spouse != null) {
            System.out.println("Развели " + this.name + " и " + this.spouse.getName());
            this.spouse = null;
            return true;
        }
        System.out.println("Не женаты!");
        return false;
    }
}
