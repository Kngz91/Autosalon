package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Car.cars;

public class Main {

    public static void main(String[] args) {
        System.out.println("..........................................................");
        System.out.println(":        Добро пожаловать в автосалон Java-Motors.       :");
        System.out.println("..........................................................");
        System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
        cars.add(Car.honda);
        Autosalon.budgetSet();
//        boolean exit = false;
//        while !exit {
//            Scanner scanner = new Scanner(System.in);
//            int choice = scanner.nextInt();
//            switch (choice):
//            case 1:
            Autosalon.choice();
//            break;
//            case 2:
//                exit = true;
//                break;
        }






    }
}


