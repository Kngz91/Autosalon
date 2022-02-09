package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Autosalon autosalon = new Autosalon();
        autosalon.createCars();
        Interface.hat();
        System.out.println("Мы поможем Вам подобрать лучший вариант. Каков Ваш бюджет?");
        Autosalon.budgetSet();
        Interface.choiceNumber();
        }
    }


