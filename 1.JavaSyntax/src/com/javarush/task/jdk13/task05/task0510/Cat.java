package com.javarush.task.jdk13.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public void initialize(String name) {
        this.name = name;
        this.age = 5;
        this. weight = 10;
        this.color = "blue";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this. weight = weight;
        this.age = age;
        this.color = "Red";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 15;
        this.color = "Dark";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 20;
    }

    public static void main(String[] args) {

    }
}
