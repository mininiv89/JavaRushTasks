package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();
        BufferedReader in = new BufferedReader(new FileReader(file1));
        char[] textLine;

        while (in.ready()) {
            textLine = in.readLine().toCharArray();
            for (int i = textLine.length-1; i >= 0; i--) {
                System.out.print(textLine[i]);
            }
            System.out.println();
        }

        in.close();


    }
}
