package org.progmatic.nov16.zoo;

public class Elephant extends Animal{

    private boolean hungry;

    public Elephant(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Elephant(String name) {
        super(name);
    }

    @Override
    public boolean isHungry() {
        if (hungry) {
            hungry = false;
            return true;
        } else {
            hungry = true;
        }
        return false;
    }
}
