package com.company;


import java.util.ArrayList;
import java.util.Scanner;


import static com.company.Car.cars;
import static com.company.Interface.*;



class Autosalon {


    private static int budget;

    public void createCars() {              //Переписать в коллекцию
        cars.add(new Car("Honda CR-V", 2007, 2.0, 4000, "Japan"));
        cars.add(new Car("Toyota Camry", 2012, 2.5, 3500, "Japan"));
        cars.add(new Car("Honda HR-V", 2005, 1.6, 1500, "Japan"));
        cars.add(new Car("Toyota Corolla", 2008, 1.5, 1800, "Japan"));
        cars.add(new Car("Honda Accord", 2011, 2.5, 2300, "Japan"));
        cars.add(new Car("Toyota Land Cruiser", 2010, 3.0, 3500, "Japan"));
        cars.add(new Car("Audi Q5", 2006, 3.5, 1900, "Germany"));
        cars.add(new Car("BMW X1", 2013, 1.8, 2800, "Germany"));
    }

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
            Car newCar = new Car(model, year, engine, price, country);
            cars.add(newCar);
            budget += newCar.getPrice();
            System.out.println("Машина принята, ваш бюджет увеличен на " + newCar.getPrice() + " $");
            menu();
            choiceNumber();


        }
    }

    public static void budgetSet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Каким бюджетом располагаете?");
        budget += scanner.nextInt();
        while (budget <= 0) {
            if (budget <= 0) {
                System.out.println("Ваш бюджет должен быть положительным");
            } else {
                System.out.println("Отлично! Вот что мы можем предложить ");
                priceSearch();
            }
        }

        if (budget > 0) {
            priceSearch();
        }
    }

    public static int getBudget() {
        return budget;
    }

    public static void choiceYearSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выполняем подбор авто по году выпуска");
        System.out.println("Введите желаемый год");
        int year = scanner.nextInt();
        boolean exit = false;
        for (int i = 0; i < cars.size(); i++) {
            while (!exit) {
                if (year == cars.get(i).getYear()) {                                //Нужен While
                    System.out.println(i + "Машина с указанным годом найдена: ");
                } else {
                    System.out.println("К сожалению машины указанного года в нашем парке нет");
                    System.out.println("Повторить поиск с другим годом выпуска? Y/N");
                    yesno();
                    exit = true;
                }
            }
        }
    }

    public static void priceSearch() {
        System.out.println("Выполняем подбор авто по стоимости:");
        boolean exit = false;
        for (int i = 0; i < cars.size(); i++) {
            while (!exit) {
                if (cars.get(i).getPrice() <= getBudget()) {
                    System.out.println(cars.get(i).carInfo());
                    break;
                } else {
                    System.out.println("В парке нет авто, подходящих вашему бюджету");
                    System.out.println("Выполнить поиск с другим бюджетом? Y/N");
                    yesnoPriceSearch();
                    exit = true;

                }
            }
        }
    }
}



