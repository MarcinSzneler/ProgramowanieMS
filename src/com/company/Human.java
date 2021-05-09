package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;
import java.util.Objects;

public class Human extends Animal{
    String firstName;
    String lastName;
    String position;
    private Double salary;
    Animal pet;
    Phone phone;
    private Car car;
    private Double cash = 20000.0;
    public final String Human_SPECIES = "homo spaiens";

    public Human(String firstName, String lastName, String position, Double salary) {
        super(species: "homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public Double getSalary() {
        System.out.println(new Date() + ": Pobrano informacje o wypłacie usera " + this.lastName);
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.getValue()) {
            System.out.println("Super, kupiłeś auto za gotówkę" + car.toString());
            this.car = car;
        } else if (this.salary > 0.83 * car.getValue()) {
            System.out.println("Kupiłeś auto, ale na raty");
            this.car = car;
        } else System.out.println("Sorry, musisz zarobić więcej!");
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("hahahah, nikt nie będzie dokładał ze swoich!");
        } else {
            System.out.println("Dane o podwyżce wysłane do księgowości.");
            System.out.println("Aneks do odebrania u pani Hani.");
            System.out.println("Info do ZUS i US przekazane.\n");
            this.salary = newSalary;
        }
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasCar(Car newCar) {
        if (this.car == newCar) {
            return true;
        }
        return false;
    }

    public void removeCar(){
        this.car = null;
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
        return "Human: " +
                firstName +
                ' ' + lastName +
                ", position: " + position;
    }
}