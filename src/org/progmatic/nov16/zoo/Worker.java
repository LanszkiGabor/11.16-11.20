package org.progmatic.nov16.zoo;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private List<Animal> animalsToLookAfter = new ArrayList<>();

    public Worker(String name, List<Animal> animalsToLookAfter) {
        this.name = name;
        this.animalsToLookAfter = animalsToLookAfter;
    }

    public Worker(String name) {
        this.name = name;
    }

    public void doDailyRoutine() {
        for (Animal animal : animalsToLookAfter) {
            if (animal.isHungry()) {
                animal.eat();
            }
        }
    }
}
