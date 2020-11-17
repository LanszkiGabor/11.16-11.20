package org.progmatic.nov16.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 7, "male");
        Monkey monkey = new Monkey("Charley");
        Elephant elephant = new Elephant("Horny", 45, "female");

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(monkey);
        animals.add(elephant);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        System.out.println();
        System.out.println("------------------Worker do daily routine------------------");
        System.out.println();

        Worker worker = new Worker("Liza", animals);
        worker.doDailyRoutine();

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        System.out.println();
        System.out.println("------------------Worker do daily routine------------------");
        System.out.println();

        worker.doDailyRoutine();

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        System.out.println();
        System.out.println("------------------Worker do daily routine------------------");
        System.out.println();

        worker.doDailyRoutine();

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
