package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        TreeMap<String, Double> map = new TreeMap<>();
        double value = 0;

        while (reader.ready()) {
            String[] textArray = reader.readLine().split(" ");
            value = Double.parseDouble(textArray[1]);

            if (map.containsKey(textArray[0])) {
                value += map.get(textArray[0]);
                map.remove(textArray[0]);
            }

            map.put(textArray[0], value);
        }
        reader.close();

        for (Map.Entry<String, Double> pair : map.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());



    }
}
