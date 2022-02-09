package com.company;


public class Car {

    private static String country;
    private static String model;
    private static int year;
    private static double engine;
    private static int price;

    public static void carInfo(){
        System.out.println(getModel() + " " + getYear() + " "
                + getEngine() + " " + getPrice() + " " + getCountry());
    }

    public Car(String model, int year, double engine, int price, String country ) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
        this.country = country;
    }

    public static int getYear() {
            return year;
    }

    public static String getModel() { return model; }

    public static double getEngine() {
            return engine;
    }

    public static int getPrice() { return price; }

    public static String getCountry() { return country; }
}
