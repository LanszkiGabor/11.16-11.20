package org.progmatic.nov18.vehicle;

public class Sport implements Vehicle{

    int maxSpeed;
    int seats;
    int weight;
    int trunkSize;
    int price = 100000;
    int age;

    public Sport(int maxSpeed, int seats, int weight, int trunkSize, int age) {
        this.maxSpeed = maxSpeed;
        this.seats = seats;
        this.weight = weight;
        this.trunkSize = trunkSize;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int maxSpeed() {
        return maxSpeed;
    }

    @Override
    public int seats() {
        return seats;
    }

    @Override
    public int weight() {
        return weight;
    }

    @Override
    public int trunkSize() {
        return trunkSize;
    }

    @Override
    public int price(int age) {
        return price / age;
    }
}
