package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        byte[][] b = a;

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (a[i][j] == 1) {
                    count++;
                    for (int j2 = j + 1; j2 < b[i].length; j2++) {
                        if (b[i][j2] == 1) {
                            b[i][j2] = 0;
                        } else break;
                    }
                    for (int i2 = i + 1; i2 < b.length; i2++) {
                        if (b[i2][j] == 1) {
                            b[i2][j] = 0;
                            for (int j2 = j + 1; j2 < b[i].length; j2++) {
                                if (b[i2][j2] == 1) {
                                    b[i2][j2] = 0;
                                } else break;
                            }
                        } else break;
                    }
                }
            }
        }

        return count;
    }
}
