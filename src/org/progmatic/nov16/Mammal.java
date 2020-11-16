package org.progmatic.nov16;

public abstract class Mammal extends Animal{

    public Mammal(String breed, String habitat, int age) {
        super(breed, habitat, age);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
