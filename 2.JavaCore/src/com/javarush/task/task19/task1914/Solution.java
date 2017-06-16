package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String[] arr = outputStream.toString().split(" ");
        int a = 0, b = 0, c = 0;

        try {
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[2]);
        } catch (Exception ignore) {

        }

        if (arr[1].equals("+")) {
            c = a + b;
        } else if (arr[1].equals("-")) {
            c = a - b;
        } else if (arr[1].equals("*")) {
            c = a * b;
        }


        String result = outputStream.toString().concat("" + c);

        System.setOut(consoleStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

