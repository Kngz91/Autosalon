package com.company;
import java.util.ArrayList;
import java.util.List;
import static com.company.Autosalon.cars;
import static com.company.Car.*;
import static com.company.Interface.*;

public class Main {

    public static void main(String[] args) {
        Car.createCars();
        Car.showCars();
    }
}

class Car{

        String model;
        int year;
        double engine;
        int price;
        String country;

        public Car(String model, int year,double engine, int price, String country) {
            this.model = model;
            this.year = year;
            this.engine = engine;
            this.price = price;
            this.country = country;
        }


    public static void showCars() {
        System.out.println(cars);
    }



    public static void createCars() {

        cars.add(new Car("Honda CR-V", 2007, 2.0, 4000, "Japan"));
        cars.add(new Car("Toyota Camry", 2012, 2.5, 3500, "Japan"));
        cars.add(new Car("Honda HR-V", 2005, 1.6, 1500, "Japan"));
        cars.add(new Car("Toyota Corolla", 2008, 1.5, 1800, "Japan"));
        cars.add(new Car("Honda Accord", 2011, 2.5, 2300, "Japan"));
        cars.add(new Car("Toyota Land Cruiser", 2010, 3.0, 3500, "Japan"));
        cars.add(new Car("Audi Q5", 2006, 3.5, 1900, "Germany"));
        cars.add(new Car("BMW X1", 2013, 1.8, 2800, "Germany"));
    }
    public String toString(){
        return model + " " + year+ " "+engine+" "+price+ " "+country;
    }
}


//        Autosalon autosalon = new Autosalon();
//        autosalon.createCars();
//        autosalon.showcars();

//        System.out.println(cars);

//        hat();
//        menu();
//        System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
//        Autosalon.budgetSet();
//        choiceNumber();




