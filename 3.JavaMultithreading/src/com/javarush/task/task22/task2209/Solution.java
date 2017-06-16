package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()))) {

            StringBuilder text = new StringBuilder();
            while (fileIn.ready()) {
                text.append(fileIn.readLine());
            }
            String[] words = text.toString().split(" ");

            StringBuilder result = getLine(words);
            System.out.println(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


        //...
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length==1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));

        while (list.remove(" "))
            list.remove(" ");

        while (isYes(list))
            Collections.shuffle(list);

        for (String s : list)
            result.append(s).append(" ");

        result.deleteCharAt(result.length() - 1);
        return result;
    }

    public static boolean isYes(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String firstWord = list.get(i).toLowerCase();
            String secondWord = list.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
