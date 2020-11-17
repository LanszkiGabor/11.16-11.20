package org.progmatic.nov16.zoo;


public abstract class Animal {

    private String name;
    private int age;
    private String gender;
    protected int fedTimes;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Animal(String name) {
        this.name = name;
        age = 1;
        gender = "unknown";
    }

    public void eat() {
        fedTimes++;
    }

    public abstract boolean isHungry();

    @Override
    public String toString() {
        return name + " is a " + age + " years old " + gender + " animal and was fed " + fedTimes + " times.";
    }


}
