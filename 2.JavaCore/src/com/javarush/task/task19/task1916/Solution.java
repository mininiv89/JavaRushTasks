package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader inFile1 = new BufferedReader(new FileReader(file1));
        BufferedReader inFile2 = new BufferedReader(new FileReader(file2));

        ArrayList<String> arrFile1 = new ArrayList<>();
        ArrayList<String> arrFile2 = new ArrayList<>();

        while (inFile1.ready()) arrFile1.add(inFile1.readLine());
        while (inFile2.ready()) arrFile1.add(inFile2.readLine());

        for (int i = 0; i < arrFile2.size(); i++) {
            if (arrFile2.get(i).equals(arrFile1.get(i))) lines.add(new LineItem(Type.SAME, arrFile2.get(i)));
            else if (i+1 == arrFile2.size()) {

            }
//            if (arrFile2.get(i))
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
