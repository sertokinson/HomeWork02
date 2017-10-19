package com.sbt.javaschool.impl;

import com.sbt.javaschool.api.Human;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void displayInfo() throws Exception {
        Human client = new Client("Ylia", 21, "Sberbank");
        assertEquals("Ylia", client.getName());
        assertEquals(21, client.getAge());
        client.displayInfo();
    }

}