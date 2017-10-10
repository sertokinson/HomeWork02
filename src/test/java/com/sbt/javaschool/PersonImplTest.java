package com.sbt.javaschool;

import org.junit.Assert;
import org.junit.Test;

public class PersonImplTest extends Assert {
    private Person person1 = new Person(true, "Oleg");
    private Person person2 = new Person(false, "Sveta");
    private Person person3 = new Person(true, "Sergey");

    @Test
    public void marry() throws Exception {
        assertTrue(person1.marry(person2));
        assertTrue(person1.marry(person2));
        assertFalse(person1.marry(person3));
    }

    @Test
    public void divorce() throws Exception {
        person1.marry(person2);
        assertTrue(person1.divorce());
        assertFalse(person1.divorce());
    }

}