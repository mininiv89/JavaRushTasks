package com.javarush.task.task18.task1805;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


///*
//Сортировка байт
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String link = reader.readLine();
//        reader.close();
//
//        FileInputStream in = new FileInputStream(link);
//        byte[] buf = new byte[in.available()];
//        while (in.available() > 0) in.read(buf);
//
//        Arrays.sort(buf);
//
//        byte x = buf[0];
//        System.out.print(x);
//        for (int i = 0; i < buf.length; i++) {
//            if (x != buf[i]) {
//                x = buf[i];
//                System.out.print(" " + x);
//            }
//        }
//        in.close();
//    }
//}
public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileInputStream input = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            input = new FileInputStream(reader.readLine());
            Set<Integer> bytes = new TreeSet<>();
            while (input.available() > 0) {
                bytes.add(input.read());
            }
            for (int b : bytes)
                System.out.print(b + " ");
        } catch (Exception e) {
        } finally {
            try {
                reader.close();
                input.close();
            } catch (Exception e) {
            }
        }
    }
}