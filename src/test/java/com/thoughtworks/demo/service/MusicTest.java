package com.thoughtworks.demo.service;

import com.thoughtworks.demo.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MusicTest extends BaseTest{
    @Autowired
    private MiniMusic miniMusic;

    @Test
    void name() {
        miniMusic.play();
    }
}
