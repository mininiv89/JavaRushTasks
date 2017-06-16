package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String fileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(fileName = reader.readLine()).equals("end")) {
                list.add(fileName);
            }
        } catch (Exception ignore) {System.out.println("Something wrong with read line.");}
        Collections.sort(list);


    }
}
