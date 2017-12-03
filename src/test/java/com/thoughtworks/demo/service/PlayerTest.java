package com.thoughtworks.demo.service;

import com.thoughtworks.demo.BaseTest;
import com.thoughtworks.demo.service.Player.PlayerDrive;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest extends BaseTest{
    @Autowired
    PlayerDrive playerDrive;
    @Test
    void name() {
        playerDrive.main();
        assertEquals("0\n1\n",outContent.toString());
    }
}
