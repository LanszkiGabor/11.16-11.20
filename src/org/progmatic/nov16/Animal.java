package org.progmatic.nov16;

public abstract class Animal {

    protected String breed;
    protected String habitat;
    protected int age;

    public Animal(String breed, String habitat, int age) {
        this.breed = breed;
        this.habitat = habitat;
        this.age = age;
    }

    public abstract void voice();


}
