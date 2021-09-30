package com.company;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
@Ignore
public class JUnitTestExample {
    public String message = "Guru99";

    JUnitMessage junitMessage = new JUnitMessage(message);
    //@Ignore("Not yet ready, please ignore")
    @Test
    public void testJUnitMessage() {

        System.out.println("Junit Message is printing");
        //assertEquals(message, junitMessage.printMessage());

    }

    @Test
    public void testJUnitHiMessage() {
        message="Hi!" +message;
        System.out.println("Junit Hi Message is printing ");
        assertEquals(message, junitMessage.printHiMessage());

    }

}
