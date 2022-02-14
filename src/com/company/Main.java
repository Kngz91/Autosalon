package com.company;

import static com.company.Interface.*;

public class Main {

    public static void main(String[] args) {
        Autosalon autosalon = new Autosalon();
        autosalon.createCars();

//        System.out.println(cars.toString());
        hat();
        menu();
//        System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
//        Autosalon.budgetSet();
        choiceNumber();
        }
    }


