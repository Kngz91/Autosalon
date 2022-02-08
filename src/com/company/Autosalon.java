package com.company;
import static com.company.Car.cars;
import java.util.ArrayList;
import java.util.Scanner;



public class Autosalon {


    public static void addCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сдаваемых машин");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите марку " + (i + 1) + " машины");
            String model = scanner.next();
            System.out.println("Введите цену " + (i + 1) + " машины");
            int price = scanner.nextInt();
            System.out.println("Введите объем двигателя " + (i + 1) + " машины");
            double engine = scanner.nextDouble();
            System.out.println("Введите год производства " + (i + 1) + " машины");
            int year = scanner.nextInt();
            System.out.println("Введите страну-производителя " + (i + 1) + " машины");
            String country = scanner.next();
            Car newCar = new Car(model,year,engine,price,country);
            cars.add(newCar);

        }
    }

    public void maxPrice() {
    }

    public static int budgetSet() {
        Scanner scanner = new Scanner(System.in);
        int budget = 0;
        while (budget <= 0) {
            budget = scanner.nextInt();
            if (budget <= 0) {
                System.out.println("Ваш бюджет должен быть положительным");
            } else {
                System.out.println("Отлично! Вот что мы можем предложить (выберите номер):");
                Interface.menu();
            }
        }
        return budget;
    }

//    public static int getBudget(){
//        return ();
//    }

    public static void priceSearch() {
        for (int i = 0; i < cars.size(); i++) {
            if (budgetSet() >= Car.getPrice()) {
                Car.carInfo();
            } else {
                System.out.println("В парке нет авто, подходящих вашему бюджету");
            }
        }
    }




//        while (budgetSet() < Car.getPrice()) {
//            if (budgetSet() >= Car.getPrice()) {
//                System.out.println("Вот авто которые вы можете себе позволить:"); //через for пройти по массиву , через if вывести подходящие
////                вывод подходящих машин
//            } else {
//                System.out.println("В парке нет авто, подходящих вашему бюджету");
//            }
//        }
//    }
}
