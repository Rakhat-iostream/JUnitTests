package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SuiteTest1 {
    public String message  = "Saurabh";
    JUnitMessage jUnitMessage = new JUnitMessage(message);
    @Test(expected = ArithmeticException.class)
    public void testUnitMessage(){
        System.out.println("JUnit Message is printing ");
        jUnitMessage.printMessage();
    }

    @Test
    public void testJUnitHiMessage(){
        message = "Hi!" + message;
        System.out.println("JUnit Hi Message is printing");
        assertEquals(message, jUnitMessage.printHiMessage());

    }
}
