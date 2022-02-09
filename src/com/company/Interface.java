package com.company;

import java.util.Scanner;

class Interface {

    static void menu(){
        System.out.println("1. Подбор авто по году выпуска");
        System.out.println("2. Подбор авто по стоимости");
        System.out.println("3. Сдать машину в Trade-In");
        System.out.println("4. Выход");
    }

    static void hat(){
        System.out.println("..........................................................");
        System.out.println(":        Добро пожаловать в автосалон Java-Motors.       :");
        System.out.println("..........................................................");
    }

    static void choiceNumber() {
        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    Autosalon.choiceYearSearch();
                    break;
                case (2):
                    Autosalon.priceSearch();
                    break;
                case (3):
                    Autosalon.addCars();
                    break;
                case (4):
                    exit = true;
                    break;
                default:
                    System.out.println("Попробуйте еще раз");
                    break;
            }
        }
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