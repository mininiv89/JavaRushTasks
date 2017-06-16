package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<File> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        File folder = new File(root);

//        Queue<File> fileTree = new PriorityQueue<>();
//
//        Collections.addAll(fileTree, folder.listFiles());
//
//        while (!fileTree.isEmpty()) {
//            File currentFile = fileTree.remove();
//            if (currentFile.isDirectory()) {
//                Collections.addAll(fileTree, currentFile.listFiles());
//            } else {
//                list.add(currentFile.getAbsolutePath());
//            }
//        }

        for (File file : folder.listFiles()) list.add(file);

        for (int i = 0; i < list.size(); i++) {
            File currentFile = list.get(i);

            if (currentFile.isDirectory())
                for (File file : currentFile.listFiles()) list.add(file);
            else result.add(currentFile.getAbsolutePath());
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        for (String file : getFileTree(args[0])) {
            System.out.println(file);
        }
    }
}
