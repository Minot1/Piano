package com.minot;

import javax.sound.midi.*;

public class Notes {

    private static Synthesizer synthesizer;
    private static Instrument[] instruments;
    private static MidiChannel[] midiChannels;

    public static void prepareSystem(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }

        instruments = synthesizer.getDefaultSoundbank().getInstruments();
        midiChannels = synthesizer.getChannels();

        synthesizer.loadInstrument(instruments[0]);
    }

    public static void playNote(int noteNumber){
        midiChannels[0].noteOn(noteNumber, 100);
    }

    public static void stopNote(int noteNumber){

        midiChannels[0].noteOff(noteNumber);

    }

}
