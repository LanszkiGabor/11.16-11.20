package org.progmatic.nov16.music;

public class AppMusic {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        guitar.play();
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        guitar2.play();
    }
}
