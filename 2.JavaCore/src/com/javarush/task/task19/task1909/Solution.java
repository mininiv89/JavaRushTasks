package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(nameFile1));
        BufferedWriter on = new BufferedWriter(new FileWriter(nameFile2));

        String textLine;
        String newTextLine;
        char[] massiveText;


        while (in.ready()) {
            textLine = in.readLine();
            massiveText = textLine.toCharArray();

            for (int i = 0; i < massiveText.length; i++)
                if (massiveText[i] == '.') massiveText[i] = '!';

            newTextLine = new String(massiveText);
            on.write(newTextLine);
        }

        in.close();
        on.close();
    }
}
