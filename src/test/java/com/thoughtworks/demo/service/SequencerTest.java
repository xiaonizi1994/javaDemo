package com.thoughtworks.demo.service;

import com.thoughtworks.demo.BaseTest;
import com.thoughtworks.demo.service.sequencer.BadException;
import com.thoughtworks.demo.service.sequencer.Music;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.MidiUnavailableException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SequencerTest extends BaseTest{
    @Autowired
    private Music music;

    @Test
    void should_get_string_when_call_play_method() throws MidiUnavailableException {
        music.play();
        assertEquals("we got a sequencer\n",outContent.toString());
    }

    @Test
    void should_throw_exception_when_call_taskRisk_method() {
        assertThrows(BadException.class,()->music.taskRisk());
    }
}
