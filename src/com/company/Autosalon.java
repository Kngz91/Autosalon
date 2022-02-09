package com.company;

import java.util.ArrayList;
import java.util.Scanner;



class Autosalon {

    private static ArrayList<Car> cars = new ArrayList<>();

    void createCars() {
        cars.add(new Car("Honda CR-V", 2007, 2.0, 4000, "Japan"));
        cars.add(new Car("Honda CR-V", 2007, 2.0, 4000, "Japan"));
        cars.add(new Car("Toyota Camry", 2012, 2.5, 3500, "Japan"));
        cars.add(new Car("Honda HR-V", 2005, 1.6, 1500, "Japan"));
        cars.add(new Car("Toyota Corolla", 2008, 1.5, 1800, "Japan"));
        cars.add(new Car("Honda Accord", 2011, 2.5, 2300, "Japan"));
        cars.add(new Car("Toyota Land Cruiser", 2010, 3.0, 3500, "Japan"));
        cars.add(new Car("BMW X1", 2013, 1.8, 2800, "Germany"));
        cars.add(new Car("Audi Q5", 2006, 3.5, 1900, "Germany"));
    }

    static void addCars() {
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
            Car newCar = new Car(model, year, engine, price, country);
            cars.add(newCar);

        }
    }

//    public void maxPrice() {
//    }

    static int budgetSet() {
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

    static void choiceYearSearch() {
        Scanner scanner = new Scanner(System.in);
        int result1 = 0;
        System.out.println("Выполняем подбор авто по году выпуска");
        System.out.println("Введите желаемый год");
        int yearIn = scanner.nextInt();
        for (int i = 0; i < cars.size(); i++) {
            if (yearIn == Car.getYear()) {
                yearIn = result1;
                System.out.println("Машина с указанным годом найдена: ");
            } else {
                System.out.println("К сожалению машины указанного года в нашем парке нет");
            }
        }
    }

    static void priceSearch() {
        System.out.println("Выполняем подбор авто по стоимости");
        for (int i = 0; i < cars.size(); i++) {
            if (budgetSet() >= Car.getPrice()) {
                Car.carInfo();
            } else {
                System.out.println("В парке нет авто, подходящих вашему бюджету");
            }
        }
    }


}
//    public void choicePriceSearch(){
//        System.out.println("Выполняем подбор авто по стоимости");
//        Autosalon.priceSearch();



