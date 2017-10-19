package com.sbt.javaschool.impl;

import com.sbt.javaschool.api.Human;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void displayInfo() throws Exception {
        Human employee = new Employee("Sergey", 23, "Sberbank");
        assertEquals("Sergey", employee.getName());
        assertEquals(23, employee.getAge());
        employee.displayInfo();
    }

}