package com.company;
import java.util.ArrayList;




public class Car {
    static ArrayList<Car> cars = new ArrayList<>();

    private static String country;
    private static String model;
    private static int year;
    private static double engine;
    private static int price;

    static Car honda = new Car("Honda",2007,2.0, 1000, "Japan");

    public static void carInfo(){
        System.out.println(getYear()+getEngine()+getPrice()+getCountry());
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
