package com.javarush.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String stop = "end";

        while (true) {
                String toAdd = reader.readLine();
            if (!toAdd.equals(stop)) {
                list.add(toAdd);
            }else {
                break;
            }
        }

        for (String string : list) {
            System.out.println(string);
        }
    }
}