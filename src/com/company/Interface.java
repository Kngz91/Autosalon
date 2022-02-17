package com.company;
import java.util.Scanner;
import static com.company.Autosalon.*;



class Interface {

    static void menu() {
        System.out.println("1. Подбор авто по году выпуска");
        System.out.println("2. Подбор авто по стоимости");
        System.out.println("3. Сдать машину в Trade-In");
        System.out.println("4. Выход");
    }

    static void hat() {
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
                case (1):
                    choiceYearSearch();
                    break;
                case (2):
                    budgetSet();
                    break;
                case (3):
                    addCars();
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


    public static void yesnoYearSearch() {
        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            String value = scanner.next();
            switch (value) {
                case ("y"):
                    choiceYearSearch();
                    break;
                case ("n"):
                    exit = true;
                    menu();
                    break;
                default:
                    System.out.println("Попробуйте еще раз");
                    break;
            }
        }
    }

    public static void yesnoPriceSearch() {
        boolean exit = false;

        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            String value = scanner.next();
            switch (value) {
                case ("y"):
                    budgetSet();
                    priceSearch();
                    break;
                case ("n"):
                    exit = true;
                    menu();
                    break;
                default:
                    System.out.println("Попробуйте еще раз");
                    break;
            }
        }

    }
}









//    public static void erase (){
//        for (int i = 0; i < 25; i++){
//            System.out.println(" ");
//        }
//    }

