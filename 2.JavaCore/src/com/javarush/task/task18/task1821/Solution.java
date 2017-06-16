package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);

        byte[] buffer = new byte[in.available()];

        while (in.available() > 0) in.read(buffer);
        in.close();

        String textFile = new String(buffer);
        char[] chars = textFile.toCharArray();

        TreeMap<Character, Integer> map = new TreeMap<>();

        int cointChar;
        for (int i = 0; i < chars.length; i++) {
            cointChar = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) cointChar++;
            }

            if (!map.containsKey(chars[i])) map.put(chars[i], cointChar);
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
