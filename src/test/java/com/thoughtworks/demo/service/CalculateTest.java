package com.thoughtworks.demo.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {
    @Test
    public void testAdd() throws Exception {
        Calculate calculate=new Calculate();
        assertEquals(3,calculate.add(1,2));
    }
}
