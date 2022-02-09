package com.company;


class Car {

    private static String country;
    private static String model;
    private static int year;
    private static double engine;
    private static int price;

    static String carInfo(){
        return (getModel() + " " + getYear() + " " + getEngine() + " " + getPrice() + " " + getCountry());
    }

    Car(String model, int year, double engine, int price, String country) {
        Car.model = model;
        Car.year = year;
        Car.engine = engine;
        Car.price = price;
        Car.country = country;
    }

    static int getYear() {
        return year;
    }

    private static String getModel() {
        return model;
    }

    private static double getEngine() {
        return engine;
    }

    static int getPrice() {
        return price;
    }

    private static String getCountry() {
        return country;
    }
}
