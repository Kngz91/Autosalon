package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
            cars.add(new Car ("Honda CR-V",2007,2.0, 4000, "Japan"));
            cars.add(new Car ("Honda CR-V",2007,2.0, 4000, "Japan"));
            cars.add(new Car ("Toyota Camry", 2012, 2.5, 3500, "Japan"));
            cars.add(new Car ("Honda HR-V",2005,1.6, 1500, "Japan"));
            cars.add(new Car ("Toyota Corolla", 2008, 1.5, 1800, "Japan"));
            cars.add(new Car ("Honda Accord",2011,2.5, 2300, "Japan"));
            cars.add(new Car ("Toyota Land Cruiser", 2010, 3.0, 3500, "Japan"));
            cars.add(new Car (" BMW X1",2013,1.8, 2800, "Germany"));
            cars.add(new Car ("Audi Q5", 2006, 3.5, 1900, "Germany"));

            Interface.hat();
            System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
            Autosalon.budgetSet();
            Interface.choiceNumber();
        }
    }


