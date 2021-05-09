package com.company.devices;

import com.company.Human;
import com.company.Producer;

public class Phone extends Device{
    Double screenSize;

    public Phone(Producer producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer,model,yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Witaj Marcin, twój telefon " + this.producer + " " + this.model + " jest gotowy do pracy");
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price){
            if (seller.getPhone() == this){
                buyer.setPhone(this);
                seller.setPhone(null);
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("\nSprzedano telefon: " + this.producer + " " + this.model + ". Kupił: " + buyer.getLastName() + " od " + seller.getLastName() + " za " + price);
            } else {
                throw new Exception("Klient nie ma tego telefonu");
            }
        } else {
            throw new Exception("Klienta nie stać na to!");
        }
    }
}