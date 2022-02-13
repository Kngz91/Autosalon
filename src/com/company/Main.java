package com.company;
import java.util.ArrayList;


import static com.company.Car.cars;
import static com.company.Interface.*;

public class Main {

    public static void main(String[] args) {
        Autosalon autosalon = new Autosalon();
        autosalon.createCars();
        System.out.println(cars.get(6).getPrice());


        hat();
        System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
        Autosalon.budgetSet();
        Interface.choiceNumber();
        }
    }


