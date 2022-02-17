package com.company;
import java.util.ArrayList;
import java.util.List;
import static com.company.Autosalon.cars;
import static com.company.Car.*;
import static com.company.Interface.*;

public class Main {

    public static void main(String[] args) {
        Autosalon.createCars();
        Car.showCars();
        hat();
        menu();
        choiceNumber();
    }
}

//        System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
//        Autosalon.budgetSet();





