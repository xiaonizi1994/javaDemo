package com.thoughtworks.demo.service.stream;

import com.thoughtworks.demo.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLongWordsTest extends BaseTest{

    @Autowired
    private CountLongWords countLongWords;

    @Test

    void should_return_count() throws IOException {
        countLongWords.getLongWordsCount();
        assertEquals("2\n2\n2\n",outContent.toString());
    }
}
