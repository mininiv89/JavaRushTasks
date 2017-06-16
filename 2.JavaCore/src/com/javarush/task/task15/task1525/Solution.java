package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            FileInputStream in = new FileInputStream(Statics.FILE_NAME);
            byte[] buf = new byte[in.available()];
            while (in.available() > 0) in.read(buf);
            in.close();

            String[] line = new String(buf).split("\n");

            for (int i = 0; i < line.length; i++) {
                if (line[i] != "\n") lines.add(line[i]);
                }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
