package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        String[] textArray;
        double value = 0;

        while (reader.ready()) {
            textArray = reader.readLine().split(" ");
            value = Double.parseDouble(textArray[1]);
            if (map.containsKey(textArray[0])) {
                value += map.get(textArray[0]);
                map.remove(textArray[0]);
            }
            map.put(textArray[0], value);
        }
        reader.close();

        Collection<Double> collection = map.values();

        double max = 0;

        for (Double x : collection) {
            if (max < x) max = x;
        }

        for (Map.Entry<String, Double> pair : map.entrySet())
            if (max == pair.getValue()) System.out.println(pair.getKey());

    }
}
