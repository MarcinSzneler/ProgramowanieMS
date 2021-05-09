package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human("Jan", "Nowak", "Java Developer", 21000.0);
        Human human2 = new Human("Jan", "Kowalski", "Automation Tester",12000.0);
        Human human3 = new Human("Piotr", "Nowy", "Support man",6500.0);
        Human human4 = new Human("Paweł", "Jasny", "Support man", 5300.0);
        Animal animal1 = new Animal("mouse", "Jerry");
        Animal animal2 = new Animal("lion", "Mufasa");
        Phone phone1 = new Phone(Producer.SAMSUNG, "S10", 2018, 12.5);
        Phone phone2 = new Phone(Producer.NOKIA, "5.1", 2020, 13.1);
        Car car1 = new Car(Producer.SKODA, "OCTAVIA",2012,2.0,"black", 15800.0);
        Car car2 = new Car(Producer.TESLA, "KOLOP",2018,2.0,"yellow", 12500.0);
        System.out.println(human1);
        System.out.println("Human: " + human1.firstName + " " + human1.lastName + " position: " + human1.position);

        if (animal1.getWeight() > animal2.getWeight())
            System.out.println("Cięższy jest " + animal1.name + ". Jego waga: " + animal1.getWeight());
        else System.out.println("Cięższy jest " + animal2.name + ". Jego waga: " + animal2.getWeight());

        System.out.println("\n---------------------\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }

        System.out.println("\n---------------------\n");
        animal2.feed();
        animal2.takeForAWalk();
        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();
        System.out.println("\n---------------------\n");
        human1.pet = animal1;
        human1.setCar(car1);
        System.out.println(human1.firstName + " " + human1.lastName + " have:\ncar: " + human1.getCar().getProducer() +
                " " + human1.getCar().getModel() + "\npet: " + human1.pet.name + " (" + human1.pet.species + ")");
        System.out.println("\n---------------------\n");
        System.out.println("Wynik porównania: " + human3.equals(human4));
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(phone1);
        System.out.println(car1);
        System.out.println("\n---------------------\n");
        human1.setSalary(12500.0);
        System.out.println("Wypłata: " + human1.getSalary());
        human1.setSalary(-200.0);
        System.out.println("Wypłata: " + human1.getSalary());
        System.out.println("\n---------------------\n");
        System.out.println("Salary: " + human2.getSalary());
        System.out.println("Car value: " + car2.getValue());
        human2.setCar(car2);
        System.out.println("\n---------------------\n");
        phone1.turnOn();
        car1.turnOn();
        System.out.println("\n---------------------\n");

        try {
            car1.sell(human1,human3,9800.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        human3.setPhone(phone1);

        try {
            phone1.sell(human3,human1,850.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            animal1.sell(human1,human4,1680.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
