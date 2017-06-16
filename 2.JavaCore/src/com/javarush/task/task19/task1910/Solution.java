package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();


        BufferedReader in = new BufferedReader(new FileReader(file1));
        BufferedWriter on = new BufferedWriter(new FileWriter(file2));

        String text = "";
        char[] buffer = new char[64 * 1024];
        int count = 0;

        while (in.ready()) {
            count = in.read(buffer);
            text += new String(buffer, 0, count);
        }
        in.close();

        text = text.replaceAll("\\p{P}", "");


        on.write(text);
        on.flush();
        on.close();

    }
}
