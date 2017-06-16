package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linkFile = reader.readLine();
        reader.close();
        BufferedReader in = new BufferedReader(new FileReader(linkFile));
        String text;
        String[] textArr;
        int coint = 0;

        while (in.ready()) {
            text = in.readLine();
            textArr = text.toString().split(" ");
            for (String x : textArr) {
                for (String y : words) {
                    if (x.equals(y)) coint++;
                }
            }
            if (coint == 2) System.out.println(text);
            coint = 0;
        }

        in.close();
    }
}
