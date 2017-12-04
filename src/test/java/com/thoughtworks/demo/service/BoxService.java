package com.thoughtworks.demo.service;

import com.thoughtworks.demo.BaseTest;
import com.thoughtworks.demo.service.Box.Box;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoxService extends BaseTest{
    @Test
    void name() {

        assertThrows(NullPointerException.class,()->Box.main());
    }
}
