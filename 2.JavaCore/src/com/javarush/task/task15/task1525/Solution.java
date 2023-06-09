package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);

        /*for (String line : lines) {
            System.out.println(line);
        }*/
    }
}
