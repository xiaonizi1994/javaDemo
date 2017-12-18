package com.thoughtworks.demo.service.sequencer;

import org.springframework.stereotype.Service;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

@Service
public class Music {
    public void play() throws MidiUnavailableException {
        Sequencer sequencer= MidiSystem.getSequencer();
        System.out.println("we got a sequencer");
    }

    public void taskRisk() throws BadException{
        throw new BadException();
    }
}
