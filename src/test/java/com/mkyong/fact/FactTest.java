/**
 * Created with IntelliJ IDEA.
 * User: iris
 * Date: 26/10/13
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
package com.mkyong.fact;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class FactTest {



    @Test
    public void shouldReturnOneWhenZeroIn() {
        assertEquals(1,Fact.factorial(0));
    }

    @Test
    public void shouldReturnOneWhenOneIn() {
        assertEquals(1,Fact.factorial(1));
    }

    @Test
    public void shouldReturnTwoWhenTwoIn() {
        assertEquals(2,Fact.factorial(2));
    }

    @Test
    public void shouldReturnSixWhenThreeIn() {
        assertEquals(6,Fact.factorial(3));
    }

    @Test
    public void shouldReturn120When5In() {
        assertEquals(120,Fact.factorial(5));
    }
} 
