package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(file));
        String[] textLine;
        int convert;
        String getResult;

        while (in.ready()) {
            textLine = in.readLine().split(" ");
            for (int i = 0; i < textLine.length; i++) {
                try {
                    convert = Integer.parseInt(textLine[i]);
                    getResult = map.get(convert);
                    if (getResult != null) {
                        textLine[i] = getResult;
                    }

                } catch (Exception ignore) {}
            }

            for (String x : textLine) System.out.print(x + " ");
            System.out.println();
        }
        in.close();
    }
}
