package org.progmatic.nov16;

public class Dog extends Mammal{

    public Dog(String breed, String habitat, int age) {
        super(breed, habitat, age);
    }

    @Override
    public void voice() {
        System.out.println("Wangwan G");
    }

}
