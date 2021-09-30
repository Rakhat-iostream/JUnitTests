package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class ArithmeticTest {
    public String message = "Saurabh";
    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Arithmetic arithmetic;
    JUnitMessage junitMessage = new JUnitMessage(message);

    public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize(){
        arithmetic = new Arithmetic();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{1,2,3}, {11,22,33}, {111,222,333},
                {10, 9, 19}, {100, 9, 109}});
    }

    @Test
    public void testArithmeticTest(){
        System.out.println("Sum of Numbers = : " + expectedResult);
        assertEquals(expectedResult, arithmetic.sum(firstNumber, secondNumber));
    }
    @Test(expected = ArithmeticException.class)
    public void testJUnitMessage(){

        System.out.println("Junit Message is printing ");
        junitMessage.printMessage();

    }

    @Test
    public void testJUnitHiMessage(){
        message="Hi!" + message;
        System.out.println("Junit Message is printing ");
        assertEquals(message, junitMessage.printMessage());

    }

}
