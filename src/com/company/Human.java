package com.company;

import com.company.devices.Car;

import java.util.Date;
import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    String position;
    private Double salary;
    private Double cash = 15000.0;
    Animal pet;
    private Car car;

    public Human(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Double getSalary() {
        System.out.println(new Date() + ": Pobraie danych o wypłacie");
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("hahahah, nikt nie będzie dokładał ze swoich!\n");
        } else {
            System.out.println("Dane o podwyżce wysłane do księgowości.");
            System.out.println("Aneks do odebrania u pani Hani.");
            System.out.println("Info do ZUS i US przekazane.\n");
            this.salary = newSalary;
        }
    }

    public void setCar(Car car) {
        if (this.salary > car.getValue()){
            System.out.println("Gratki, kupiłeś auto :) " + car.toString());
            this.car = car;
        } else if (this.salary > 0.83*car.getValue()){
            System.out.println("Noooo a jednak, wziąłeś na kredyt...");
            this.car = car;
        } else System.out.println("No way! Skombinuj hajs!");
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(position, human.position) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, pet, car);
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                ", last name: " + lastName +
                ", position: " + position;
    }
}