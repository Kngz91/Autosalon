package com.company;


import java.util.ArrayList;

class Car {

    public static ArrayList<Car> cars = new ArrayList<>(20);

    private static String country;
    private static String model;
    private static int year;
    private static double engine;
    private static int price;

    public String carInfo(){
        return (getModel() + " " + getYear() + " " + getEngine() + " " + getPrice() + " " + getCountry());
    }

    public Car(String model, int year, double engine, int price, String country) {
        Car.model = model;
        Car.year = year;
        Car.engine = engine;
        Car.price = price;
        Car.country = country;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }
}
