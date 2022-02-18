package com.company;


class Car {

    String model;
    int year;
    double engine;
    int price;
    String country;

    public Car(String model, int year, double engine, int price, String country) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
        this.country = country;
    }


    public static void showCars() {
//        System.out.println(cars.get(6).getPrice());
    }

    public String toString() {
        return model + " " + year + " " + engine + " " + price + " " + country;
    }


    public String carInfo(){
        return (getModel() + " " + getYear() + "г.в " + getEngine() + "L " + getPrice() + "$ " + getCountry());
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



//    public void setYear(int year){
//        this.year = year;
//    }
//    public void setPrice(int price){
//        this.price = price;
//    }

