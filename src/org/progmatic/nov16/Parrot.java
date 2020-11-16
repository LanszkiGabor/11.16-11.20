package org.progmatic.nov16;

public class Parrot extends Bird{

    public Parrot(String breed, String habitat, int age, int wingWidth) {
        super(breed, habitat, age, wingWidth);
    }

    @Override
    public void voice() {
        System.out.println("Beszélek");
    }
}
