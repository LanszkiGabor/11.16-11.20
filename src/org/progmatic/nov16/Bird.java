package org.progmatic.nov16;

public abstract class Bird extends Animal{

    protected int wingWidth;

    public Bird(String breed, String habitat, int age, int wingWidth) {
        super(breed, habitat, age);
        this.wingWidth = wingWidth;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wingWidth=" + wingWidth +
                ", breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
