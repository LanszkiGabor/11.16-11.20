package org.progmatic.nov16.music;

public class ElectricGuitar extends StringedInstrument{


    public ElectricGuitar() {
        name = "Electric Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        name = "Electric Guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
