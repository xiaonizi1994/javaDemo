package com.thoughtworks.demo.service;

import org.springframework.stereotype.Service;

import javax.sound.midi.*;

@Service
public class MiniMusic{
    public void play(){
        try {
            Sequencer player= MidiSystem.getSequencer();
            player.open();

            Sequence seq=new Sequence(Sequence.PPQ,4);

            Track track=seq.createTrack();

            ShortMessage a=new ShortMessage();
            ShortMessage b=new ShortMessage();
            a.setMessage(192,1,102,100);

            a.setMessage(144,2,100,100);
            MidiEvent noteOn=new MidiEvent(a,1);
            track.add(noteOn);


            b.setMessage(128,2,100,100);
            MidiEvent noteOff=new MidiEvent(b,8);
            track.add(noteOff);

            a.setMessage(144,2,44,100);
            noteOn=new MidiEvent(a,8);
            track.add(noteOn);

            b=new ShortMessage();
            b.setMessage(128,2,44,100);
            noteOff=new MidiEvent(b,9);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MiniMusic miniMusic=new MiniMusic();
        miniMusic.play();
    }
}
