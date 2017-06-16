package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
//        BufferedReader file1 = new BufferedReader(new FileReader("/Users/igor/Documents/JavaRushHomeWork/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1923/1.txt"));
//        BufferedWriter file2 = new BufferedWriter(new FileWriter("/Users/igor/Documents/JavaRushHomeWork/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1923/2.txt"));

        String[] textLine;

        while (file1.ready()) {
            textLine = file1.readLine().toString().split(" ");
            System.out.println(Arrays.toString(textLine));
            for (String x : textLine) {
                if (x.matches(".+[0-9].+")) {
                    file2.write(x + " ");
                }
            }
        }


        file1.close();
        file2.flush();
        file2.close();

    }
}
