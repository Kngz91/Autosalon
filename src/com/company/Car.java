package com.company;
import java.util.ArrayList;


public class Car {
    static ArrayList<Car> cars = new ArrayList<>();
//            add(honda1);
//            add(honda2);
//            add(honda3);
//            add(toyota1);
//            add(toyota2);
//            add(toyota3);
//            add(bmw1);
//            add(audi1);

    private static String country;
    private static String model;
    private static int year;
    private static double engine;
    private static int price;

    static Car honda1 = new Car("Honda CR-V",2007,2.0, 4000, "Japan");
    static Car toyota1 = new Car("Toyota Camry", 2012, 2.5, 3500, "Japan");
    static Car honda2 = new Car("Honda HR-V",2005,1.6, 1500, "Japan");
    static Car toyota2 = new Car("Toyota Corolla", 2008, 1.5, 1800, "Japan");
    static Car honda3 = new Car("Honda Accord",2011,2.5, 2300, "Japan");
    static Car toyota3 = new Car("Toyota Land Cruiser", 2010, 3.0, 3500, "Japan");
    static Car bmw1 = new Car(" BMW X1",2013,1.8, 2800, "Germany");
    static Car audi1 = new Car("Audi Q5", 2006, 3.5, 1900, "Germany");




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
