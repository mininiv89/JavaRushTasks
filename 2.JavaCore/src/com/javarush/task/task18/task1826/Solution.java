package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in;
        FileOutputStream on;
        String dec;
        in = new FileInputStream(args[1]);
        on = new FileOutputStream(args[2]);
        decode(in, on);

    }

    public static void decode(FileInputStream in, FileOutputStream on) throws IOException {
        while (in.available() > 0) {
            int data = in.read();
            on.write(data^5);
        }
        in.close();
        on.close();
    }
}
