package com.company;

public class Animal {
    final String species;
    String name;
    double weight;

    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 120.0;
    public static final Double DEFAULT_WEIGHT = 2.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (species.equals("mouse")) {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species.equals("lion")) {
            this.weight = DEFAULT_LION_WEIGHT;
        } else this.weight = DEFAULT_WEIGHT;
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("To late :(");
        } else {
            weight++;
            System.out.println(this.species + "--> thx :) my weight is now " + this.weight);
        }
    }

    void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("No! The " + this.species + " is dead :( You can't go for a walk with a dead animal.");
        } else if (weight <= 3) {
            System.out.println(this.species + "--> Yeaaah :) but I am hungry...");
        } else {
            System.out.println(this.species + "--> Thx for a walk bro, my weight is now: " + this.weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}