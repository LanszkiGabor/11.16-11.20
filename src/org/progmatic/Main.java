package org.progmatic;

import org.progmatic.nov16.*;

import java.util.ArrayList;
import java.util.TimerTask;

public class Main {

    private static Class<? extends Animal> Mammal;

    public static void main(String[] args) {
        Point2D pont = new Point2D(3, 4);
        pont.twoTime();
        pont.get();
        Point3D pont2 = new Point3D(3, 4, 5);
        pont2.twoTime();
        pont2.get();

        Penguin kacsa = new Penguin("Császárpingvin", "Déli-sark", 2, 120);
        Cat macsek = new Cat("Perzsa", "Ház", 5, true);
        Cat tigirs = new Cat("Tigris", "Kína", 6, false);
        Dog kutya = new Dog("Mopsz", "Ház", 10);
        Parrot papagaj = new Parrot("Nagy", "Dél-Amerika", 25, 90);
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(kacsa);
        zoo.add(macsek);
        zoo.add(tigirs);
        zoo.add(kutya);
        zoo.add(papagaj);
        diffSpec(zoo);
    }

    public static void diffSpec(ArrayList<Animal> zoo) {
        int mammal = 0;
        int bird = 0;
        for (Animal animal : zoo) {
            if (animal instanceof Mammal) {
                mammal++;
            } else {
                bird++;
            }
        }
        System.out.println("Ennyi emlős: " + mammal);
        System.out.println("Ennyi madár: " + bird);
    }
}
