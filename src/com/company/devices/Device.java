package com.company.devices;

import com.company.Producer;
import com.company.Saleable;

public abstract class Device implements Saleable {
    public final Producer producer;
    public final Integer yearOfProduction;
    public final String model;

    public Device(Producer producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    public abstract void turnOn();
}
