package com.sbt.javaschool;


public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if(this.man!=person.man){
            if(this.spouse!=null){
                this.spouse.divorce();
                this.divorce();
            }
            if(person.spouse!=null){
                person.spouse.divorce();
                person.divorce();
            }
            this.spouse=person;
            person.spouse=this;
            System.out.println("Поженили "+this.name+" и "+person.name);
            return true;
        }
        System.out.println("Невозможно поженить по закону!");
        return false;
    }

    public boolean divorce() {
        if(this.spouse!=null){
            System.out.println("Развели "+this.name+" и "+this.spouse.name);
            this.spouse=null;
            return true;
        }
        System.out.println("Не женаты!");
        return false;
    }
}
