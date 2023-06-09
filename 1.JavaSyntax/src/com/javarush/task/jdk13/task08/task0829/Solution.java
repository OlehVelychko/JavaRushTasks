package com.javarush.task.jdk13.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Нужно добавить в программу новую функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            map.put(city, family);
        }

        String currentCity = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(currentCity)) {
                System.out.println(pair.getValue());
            }
        }
    }
}
