package com.thoughtworks.demo.service;

import com.thoughtworks.demo.BaseTest;
import com.thoughtworks.demo.service.constructDemo.Child;
import com.thoughtworks.demo.service.constructDemo.Parent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.Verifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructDemoTest extends BaseTest{

    private final ByteArrayOutputStream outContent=new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void clearUpStreams(){
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    void name() {
        Child child=new Child(1,"1");
        assertEquals("parent i j\nchild i j\n",outContent.toString());
    }
}
