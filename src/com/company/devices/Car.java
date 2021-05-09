package com.company.devices;

import com.company.Producer;
import com.company.Human;

public class Car extends Device{
    Double engine;
    String color;
    private Double value;

    public Car(Producer producer, String model, Integer yearOfProduction, Double engine, String color, Double value) {
        super(producer,model,yearOfProduction);
        this.engine = engine;
        this.color = color;
        this.value = value;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Wrrrrrrr....!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)){
            throw new Exception("Klient nie ma tego auta");
        }
        if (buyer.getCash() < price) {
            throw new Exception("Klient nie ma tyle szmalu!");
        }
        buyer.setCar(this);
        seller.removeCar();
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("\nSprzedano auto: " + this.producer + " " + this.model + ". Kupił: " + buyer.getLastName() + ", a sprzedał " + seller.getLastName() + " za " + price + ".");
        System.out.println(buyer.getLastName() + " ma " + buyer.getCash());
        System.out.println(seller.getLastName() + " ma " + seller.getCash());
    }
}