package org.progmatic.nov16.zoo;

public class Monkey extends Animal{

    public Monkey(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public boolean isHungry() {
        return (int) (Math.random() * 2) < 1;
    }
}
