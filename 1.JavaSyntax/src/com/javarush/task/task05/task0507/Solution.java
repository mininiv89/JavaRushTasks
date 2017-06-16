package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int a = 0;
        double sum = 0;
        while (true) {
            a = scanner.nextInt();
            if (a == -1) {
                double c = sum / i;
                System.out.println(c);
                break;
            }
            sum += a;
            i++;
        }
    }
}

