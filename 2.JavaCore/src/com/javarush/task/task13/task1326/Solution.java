package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = reader.readLine();
        reader.close();

        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(link)));

        ArrayList<Integer> list = new ArrayList<>();
        try {

            while (file.ready()) {
                try {
                    int x = Integer.parseInt(file.readLine());
                    if (x % 2 == 0) list.add(x);

                }
                catch (Exception e) {
                }
            }
        } catch (Exception e) {
        } finally {
            file.close();
        }


        Collections.sort(list);
        for (int x : list) System.out.println(x);


    }
}
