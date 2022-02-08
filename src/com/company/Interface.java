package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    public static void menu(){
        System.out.println("1. Подбор авто по году выпуска");
        System.out.println("2. Подбор авто по стоимости");
        System.out.println("3. Сдать машину в Trade-In");
        System.out.println("4. Выход");
    }

    public static void hat (){
        System.out.println("..........................................................");
        System.out.println(":        Добро пожаловать в автосалон Java-Motors.       :");
        System.out.println("..........................................................");
    }

    public static void choiceNumber() {
        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: choice = 1;
                    choiceYearSearch();
                    break;
                case 2: choice = 2;
                    choicePriceSearch();
                    break;
                case 3: choice = 3;
                    Autosalon.addCars();
                    break;
                case 4: choice = 0;
                    exit = true;
                    break;
            }
        }
    }

    public static void choiceYearSearch() {
        Scanner scanner = new Scanner(System.in);
        int result1 = 0;
        System.out.println("Выполняем подбор авто по году выпуска");
        System.out.println("Введите желаемый год");
        int yearIn = scanner.nextInt();
        for (int i = 0; i < Car.cars.size(); i++) {
            if (yearIn == Car.getYear()) {
                yearIn = result1;
                System.out.println("Машина с указанным годом найдена: ");
            } else {
                System.out.println("К сожалению машины указанного года в нашем парке нет");
            }
        }
    }

    public static void choicePriceSearch(){
        System.out.println("Выполняем подбор авто по стоимости");
        Autosalon.priceSearch();
    }
}


//
//            priceSearch();
//        }if (number == 3) {
//            System.out.println("У нас лучшие цены! Расскажите подробнее.");
//            addCars();
//
//        }else{
//            System.out.println("Некорректный ввод,выберите номер пункта из списка");
//        }
//    }


//    public static void erase (){
//        for (int i = 0; i < 25; i++){
//            System.out.println(" ");
//        }
//    }

//    public static int choice2() {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if (number == 1) {
//            choiceYearSearch();
//        }if (number == 2){
//            choicePriceSearch();
//        }if (number == 3){
//            Autosalon.addCars();
//        }if (number ==4){
//            clearScreen();
//        }
//
//        return number;
//    }