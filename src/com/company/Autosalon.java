package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Interface.*;



class Autosalon {

    List<Car> cars;
    private int budget;

    public Autosalon() {
        cars = new ArrayList<>();
        budget = 0;
    }

    public void createCars() {
        cars.add(new Car("Audi Q5", 2006, 3.5, 1900, "Germany"));
        cars.add(new Car("Honda CR-V", 2007, 2.0, 4000, "Japan"));
        cars.add(new Car("Toyota Camry", 2012, 2.5, 3500, "Japan"));
        cars.add(new Car("Honda HR-V", 2005, 1.6, 1500, "Japan"));
        cars.add(new Car("Toyota Corolla", 2008, 1.5, 1800, "Japan"));
        cars.add(new Car("Honda Accord", 2011, 2.5, 2300, "Japan"));
        cars.add(new Car("Toyota Land Cruiser", 2010, 3.0, 3500, "Japan"));
        cars.add(new Car("BMW X1", 2013, 1.8, 2800, "Germany"));
    }

    public void addCars() {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Укажите марку ");
            String model = scanner.next();
            System.out.println("Укажите цену ");
            int price = scanner.nextInt();
            System.out.println("Укажите объем двигателя ");
            double engine = scanner.nextDouble();
            System.out.println("Укажите год производства ");
            int year = scanner.nextInt();
            System.out.println("Укажите страну-производителя ");
            String country = scanner.next();
            Car newCar = new Car(model, year, engine, price, country);
            cars.add(newCar);
            budget += newCar.getPrice();
            System.out.println("Машина принята, ваш бюджет увеличен на " + newCar.getPrice() + " $");
            menu();
            choiceNumber();
        }
    }

    public void budgetSet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Каким бюджетом располагаете? (Без учета Trade-In)");
        budget += scanner.nextInt();
        while (budget <= 0) {
            if (budget < 0) {
                System.out.println("Ваш бюджет должен быть положительным");
            } else {
                priceSearch();
            }
        }

    }

    public void choiceYearSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выполняем подбор авто по году выпуска");
        System.out.println("Введите желаемый год");
        int year = scanner.nextInt();
        boolean exit = false;
        for (int i = 0; i < cars.size(); i++) {
            while (!exit) {
                if (year == cars.get(i).getYear()) {                                //Нужен While
                    System.out.println((i + 1) + " " + "Машина с указанным годом найдена: ");
                    System.out.println(cars.get(i).carInfo());
                    break;
                } else {
                    System.out.println("К сожалению машины указанного года в нашем парке нет");
                    System.out.println("Повторить поиск с другим годом выпуска? Y/N");
                    yesnoYearSearch();
                    exit = true;
                }
            }
        }
    }

    public void priceSearch() {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("Введите желаемый бюджет: ");
            int budget = scanner.nextInt();
            System.out.println("Выполняем подбор авто по стоимости:");
            List<Car> budgetCars = new ArrayList<Car>();
            for (Car car : cars) {
                if (car.getPrice() <= budget) {
                    budgetCars.add(car);
                }
            }

            if (budgetCars.size() == 0) {
                System.out.println("К сожалению, подходящих машин нет");
                System.out.println("Выполнить поиск с другим бюджетом? Y/N");

                String value = scanner.next();
                if (value.equals("n")) {
                    exit = true;
                }
            } else {
                System.out.println("Найденные автомобили по Вашему бюджету:");
                for (Car car: budgetCars) {
                    System.out.println(car.toString());
                }
            }
        }
    }

    /* Get */
    public int getBudget() {
        return budget;
    }

    public List<Car> getCars() {
        return cars;
    }
}










