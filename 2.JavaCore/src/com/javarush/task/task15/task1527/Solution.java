package com.javarush.task.task15.task1527;

import java.awt.geom.Arc2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        text = text.substring(text.lastIndexOf('?')+1, text.length());
        String[] lines = text.split("&");
        for (String x : lines) {
            if (x.contains("=")) System.out.print(x.substring(0, x.lastIndexOf("=")) + " ");
            else System.out.print(x + " ");
        }
        System.out.println();

        for (String x : lines) {
            if (x.contains("obj")) {
                String number = x.substring(x.lastIndexOf("=") + 1, x.length());
                try {
                    Double num = Double.parseDouble(number);
                    alert(num);
                } catch (Exception e) {
                    alert(number);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
