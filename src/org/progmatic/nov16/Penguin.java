package org.progmatic.nov16;

public class Penguin extends Bird{

    public Penguin(String breed, String habitat, int age, int wingWidth) {
        super(breed, habitat, age, wingWidth);
    }

    @Override
    public void voice() {
        System.out.println("Háp");
    }
}
