package com.javarush.task.pro.task09.task0919;

/* 
Разворот строки
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder myString = new StringBuilder(string);
        myString.reverse();
        return myString.toString();
    }
}
