package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);
//        FileInputStream in = new FileInputStream("C:\\Users\\i.minin\\Desktop\\1.txt");
        String path = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        int cointEng = 0;
        byte[] chars = new byte[in.available()];

        while (in.available() > 0) in.read(chars);
        in.close();

        String stringChars = new String(chars);
        char[] elChar = stringChars.toCharArray();


        for (char x : elChar) {
            String text = ""+x;
            if (path.contains(text)) cointEng++;
        }

        System.out.println(cointEng);

    }
}
