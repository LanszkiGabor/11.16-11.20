package org.progmatic.nov16.music;

public abstract class StringedInstrument extends Instrument{

    protected int numberOfStrings;

    public StringedInstrument() {
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    public abstract void play();
}
