package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(nameFile1));
        BufferedWriter on = new BufferedWriter(new FileWriter(nameFile2));
        char[] buffer = new char[1];
        String textLine;
        String[] massiveText;
        int integerToWrite;

        while (in.ready()) {
            textLine = in.readLine();
            massiveText = textLine.split(" ");

            for (String text : massiveText) {
                try {
                    integerToWrite = Integer.parseInt(text);
                    on.write(integerToWrite + " ");
                } catch (Exception ignore) {
                    //nop
                }
            }

        }

        in.close();
        on.close();

    }
}
