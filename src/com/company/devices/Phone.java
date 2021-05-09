package com.company.devices;

import com.company.Human;
import com.company.Producer;

public class Phone extends Device{
    double screenSize;

    public Phone(Producer producer, String model, Integer yearOfProduction, double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println(this.producer + " " + this.model + " jest gotowy do pracy!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Zaimplementuj mnie");
    }
}