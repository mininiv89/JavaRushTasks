package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = reader.readLine();
        reader.close();

        FileReader in = new FileReader(link);
        char[] buffer = new char[1];
        String text = "";
        int coint;
        ArrayList<Character> chars = new ArrayList<>();

        while (in.ready()) {
            coint = in.read(buffer);
            text += new String(buffer, 0, coint);
        }
        in.close();
        String pattern = "\\W+";
        String[] words = text.split(pattern);

//        System.out.println(Arrays.toString(words));

        int cointWorld = 0;
        for (String word : words) {
            if (word.equals("world")) cointWorld++;
        }

        System.out.println(cointWorld);


    }
}
