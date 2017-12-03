package com.thoughtworks.demo.service;

import com.thoughtworks.demo.BaseTest;
import com.thoughtworks.demo.service.constructDemo.Child;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructDemoTest extends BaseTest{

    @Test
    void name() {
        Child child=new Child(1,"1");
        assertEquals("parent i j\nchild i j\n",outContent.toString());
    }
}
