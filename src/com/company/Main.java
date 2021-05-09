package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Animal animal1 = new Animal("mouse", "Jerry");
        Animal animal2 = new Animal("lion", "Mufasa");

        Human human1 = new Human("Jan", "Nowak", "UX Designer");
        Human human2 = new Human("Janusz", "Kowalski", "Manual Tester");
        Human human3 = new Human("Keith", "Yellowstone", "Project Manager");
        Human human4 = new Human("Keith", "Yellowstone", "Project Manager");

        Phone phone1 = new Phone(Producer.SAMSUNG, "S10", 2019,8.5);
        Phone phone2 = new Phone(Producer.NOKIA, "5.1", 2020, 7.0);

        Car car1 = new Car(Producer.KIA, "CARRENS", 2017, 1.8, "black", 25600.0);

        System.out.println(animal1);
        System.out.println(animal1.name);

        Animal animalWithMaxWeiht = animal1.weight > animal2.weight ? animal1 : animal2;
        StringBuilder animalWithMaxWeightDesription = new StringBuilder()
                .append("The heaviest animal: ")
                .append(animalWithMaxWeiht.species)
                .append(" ")
                .append(animalWithMaxWeiht.name)
                .append(". His weight: ")
                .append(animalWithMaxWeiht.weight)
                .append(" kg.");
        System.out.println(animalWithMaxWeightDesription);
        System.out.println("\n----------------\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);
        humansList.add(human4);

        System.out.println("Lista humans:");

        FileWriter fw = new FileWriter("human.txt", false);
        for (Human human : humansList) {
            System.out.println(human);
            fw.write(human.firstName + " " + human.lastName + " , " + human.position + "\n");
        }
        fw.close();

        System.out.println("\n----------------\n");


        animal2.feed();
        animal2.takeForAWalk();

        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();

        System.out.println("\n----------------\n");

        human1.setSalary(12500.0);
        human1.setCar(car1);
        human1.pet = animal1;

        if (human1.getCar() != null)
            System.out.println(human1.firstName + " have a car: " + human1.getCar().getProducer() + " " + human1.getCar().getModel() + " and have a pet " + human1.pet.name + " (" + human1.pet.species + ")");

        System.out.println("\n----------------\n");

        if (human3.equals(human4)) System.out.println("Wynik porównania: TRUE");
        else System.out.println("Wynik porównania: FALSE\n");

        System.out.println(car1);
        System.out.println(human1);
        System.out.println(phone1);
        System.out.println(animal1);

        System.out.println("\n----------------\n");

        System.out.println("Wypłata: " +human1.getSalary() + "\n");

        human1.setSalary(-900.0);
        human1.setSalary(13000.0);

        System.out.println("\n----------------\n");

        car1.turnOn();
        phone1.turnOn();

        System.out.println("\n----------------\n");

        car1.sell(human1,human3,9800.0);
    }

}
