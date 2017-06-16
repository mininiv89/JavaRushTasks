package com.javarush.task.task18.task1809;

///*
//Реверс файла
//*/
//
//import java.io.*;
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String t1 = reader.readLine();
//        String t2 = reader.readLine();
//        FileInputStream in = new FileInputStream(t1);
//        FileOutputStream on = new FileOutputStream(t2);
//        reader.close();
//
//        byte[] buffer = new byte[in.available()];
//        while (in.available() > 0) in.read(buffer);
//        byte[] reverse = new byte[buffer.length];
//        for (int i = buffer.length; i <=0; i--) {
//            for (int j = 0; j < buffer.length; j++) {
//                reverse[j] = buffer[i];
//            }
//        }
//
//
//        on.write(reverse, 0, reverse.length);
//        in.close();
//        on.close();
//
//    }
//}
/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t1 = reader.readLine();
        String t2 = reader.readLine();
        FileInputStream fileOne = new FileInputStream(t1);
        FileOutputStream fileTwo = new FileOutputStream(t2);

        while (fileOne.available() > 0) {

            byte[] buffer = new byte[fileOne.available()];
            fileOne.read(buffer);

            for (int i = buffer.length - 1; i >= 0; i--)
                fileTwo.write(buffer[i]);
        }

        reader.close();
        fileOne.close();
        fileTwo.close();
    }
}
