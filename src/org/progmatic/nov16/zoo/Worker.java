package org.progmatic.nov16.zoo;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private final String name;
    private final List<Animal> animalsToLookAfter;

    public Worker(String name, List<Animal> animalsToLookAfter) {
        this.name = name;
        this.animalsToLookAfter = animalsToLookAfter;
    }

    public Worker(String name) {
        this.name = name;
        animalsToLookAfter = new ArrayList<>();
    }

    public void doDailyRoutine() {
        for (Animal animal : animalsToLookAfter) {
            if (animal.isHungry()) {
                animal.eat();
            }
        }
    }
}
