package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String link_1, link_2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        link_1 = reader.readLine();
        link_2 = reader.readLine();
        reader.close();

        BufferedReader file_1 = new BufferedReader(new InputStreamReader(new FileInputStream(link_1)));
        while (file_1.ready()) allLines.add(file_1.readLine());
        file_1.close();
        BufferedReader file_2 = new BufferedReader(new InputStreamReader(new FileInputStream(link_2)));
        while (file_2.ready()) forRemoveLines.add(file_2.readLine());
        file_2.close();

        new Solution().joinData();
    }

    public void joinData() throws IOException {

        if (!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        } else {
            for (String x : forRemoveLines) allLines.remove(x);
        }

    }
}
