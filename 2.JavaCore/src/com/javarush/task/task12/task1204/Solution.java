package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    /*public static void printObjectType(Object o) {
        switch (o.getClass().getSimpleName()) {
            case "Cat" -> System.out.println("Кошка");
            case "Dog" -> System.out.println("Собака");
            case "Bird" -> System.out.println("Птица");
            case "Lamp" -> System.out.println("Лампа");
        }
    }*/
    public static void printObjectType(Object o) {
        switch (o.getClass().getSimpleName()) {
            case ("Cat"):
                System.out.println("Кошка");
                break;
            case ("Dog"):
                System.out.println("Собака");
                break;
            case ("Bird"):
                System.out.println("Птица");
                break;
            case ("Lamp"):
                System.out.println("Лампа");
                break;
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
