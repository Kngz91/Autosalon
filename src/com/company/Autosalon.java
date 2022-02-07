package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Car.cars;

public class Autosalon {


    public static void addCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сдаваемых машин");
        int n = scanner.nextInt();

        for (int i = 0; i < n; n++) {
            System.out.println("Введите марку" + (i + 1) + " машины");
            String model = scanner.nextLine();
            System.out.println("Введите цену " + (i + 1) + " машины");
            int price = scanner.nextInt();
            System.out.println("Введите объем двигателя " + (i + 1) + " машины");
            double engine = scanner.nextDouble();
            System.out.println("Введите год производства " + (i + 1) + " машины");
            int year = scanner.nextInt();
            System.out.println("Введите страну-производителя " + (i + 1) + " машины");
            String country = scanner.nextLine();
            Car newCar = new Car(model,year,engine,price,country);
            cars.add(newCar);
        }
    }

    
    public void maxPrice() {
    }

    public static int budgetSet() {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();;
        if (budget > 0 ) {
            System.out.println("Отлично! Вот что мы можем предложить (выберите номер):");
            System.out.println("1. Подбор авто по году выпуска");
            System.out.println("2. Подбор авто по стоимости");
            System.out.println("3. Сдать машину в Trade-In");
        } else {
            System.out.println("Ваш бюджет должен быть положительным");
            budgetSet();
        }
        return budget;

    }
    public static int getBudget(){
        return budgetSet();
    }
//    public static void yourBudget(){
//        System.out.println(budgetSet());
//    }
    static void priceSearch(){
        System.out.println("Вот авто которые вы можете себе позволить:");
        if (getBudget() >= Car.getPrice()) {   //условие не true, fixit
            System.out.println("Проверка метода");    //прописать логику
            }else{
                System.out.println("В парке нет авто, подходящих вашему бюджету");
            }
    }
    static void choice(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result1 = 0;
        if (number == 1) {
            System.out.println("Выполняем подбор авто по году выпуска");
            System.out.println("Введите желаемый год");
            int yearIn = scanner.nextInt();
            for (int i = 0; i< cars.size(); i++ ) {
                if (yearIn == Car.getYear()) {
                    yearIn=result1;
                    System.out.println("Машина с указанным годом найдена: ");
                } else {
                    System.out.println("К сожалению машины указанного года в нашем парке нет");
                }
            }
        }if (number == 2) {
            System.out.println("Выполняем подбор авто по стоимости");
            priceSearch();
        }if (number == 3) {
            System.out.println("У нас лучшие цены! Расскажите подробнее.");
            addCars();

        }else{
            System.out.println("Некорректный ввод,выберите номер пункта из списка");
        }
    }
}
