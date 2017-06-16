package com.javarush.task.task20.task2025;

/* 
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long n) {
        //База данных значений
        long[][] bd = new long[7][62];
        for (int i = 2; i < 9; i++) {
            for (int j = 1; j < 63; j++)
                bd[i-2][j-1] = (long) Math.pow(i,j);
        }

        for (int i = 1; i <= n; i++) {

        }


        long[] result = null;
        return result;
    }

    public static void main(String[] args) {
        long[] result = getNumbers(Long.MAX_VALUE);
        System.out.println(result.length);
    }
}
