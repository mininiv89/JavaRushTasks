package com.javarush.task.task18.task1805;


        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileInputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.Collections;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(new File(file));
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        if (in.available() > 0) {
            buffer.add(in.read());
        }
        in.close();

        Collections.sort(buffer);

        for (int i = 0; i < buffer.size(); i++) {
            if (i == buffer.size()-1) break;
            if (buffer.get(i) == buffer.get(i+1)) {
                buffer.remove(i);
                i--;
            }
        }

        for (Integer x : buffer) System.out.print(x+" ");
    }
}