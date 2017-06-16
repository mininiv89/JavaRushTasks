package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t1 = reader.readLine();
        String t2 = reader.readLine();
        String t3 = reader.readLine();
        FileInputStream f1 = new FileInputStream(t1);
        FileOutputStream f2 = new FileOutputStream(t2);
        FileOutputStream f3 = new FileOutputStream(t3);

        byte[] bt = new byte[f1.available()];
        int count = f1.available();
        int count_f3 = count/2;
        int count_f2 = count - count_f3;

        while (f1.available() > 0) f1.read(bt);

        f2.write(bt,0,count_f2);
        f3.write(bt, count_f2, count_f3);
        f1.close();
        f2.close();
        f3.close();

    }
}
