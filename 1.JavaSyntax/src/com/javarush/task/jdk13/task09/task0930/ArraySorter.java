package com.javarush.task.jdk13.task09.task0930;

import java.util.Arrays;

public class ArraySorter {

    public void sort(String[] array) {
        String minStringValue = null;
        int maxIntValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j])) {
                    if (Integer.parseInt(array[j]) > Integer.parseInt(array[i])) {
                        maxIntValue = Integer.parseInt(array[j]);
                        array[j] = array[i];
                        array[i] = String.valueOf(maxIntValue);
                    }
                } else if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (!isGreaterThan(array[j], array[i])) {
                        minStringValue = array[j];
                        array[j] = array[i];
                        array[i] = minStringValue;
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
