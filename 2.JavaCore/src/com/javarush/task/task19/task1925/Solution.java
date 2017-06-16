package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedWriter on = new BufferedWriter(new FileWriter(args[1]));
        String[] textLine;
        String textToWrite = "";

        while (in.ready()) {
            textLine = in.readLine().toString().split(" ");
            for (int i = 0; i < textLine.length; i++) {
                if (textLine[i].length() > 6) {
                    textToWrite += textLine[i] + ",";
                }
            }
        }
        textToWrite = textToWrite.substring(0, textToWrite.length() - 1);
        on.write(textToWrite);
        in.close();
        on.flush();
        on.close();
    }
}
