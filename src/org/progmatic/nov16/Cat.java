package org.progmatic.nov16;

public class Cat extends Mammal{

    private boolean isDomestic;

    public Cat(String breed, String habitat, int age, boolean isDomestic) {
        super(breed, habitat, age);
        this.isDomestic = isDomestic;
    }


    @Override
    public void voice() {
        if (isDomestic) {
            System.out.println("Meow");
        } else {
            System.out.println("Meow meow niBBa");
        }
    }
}
