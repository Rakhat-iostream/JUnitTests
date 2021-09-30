package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstClassTest {
    @Test
    public void myFirstMethod(){
        String str= "JUnit is working fine";
        assertEquals("JUnit is working fine",str);
    }

}
