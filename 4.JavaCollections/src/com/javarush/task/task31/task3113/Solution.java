package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


/*
Что внутри папки?
*/
public class Solution {
    static int countDirectory = -1;
    static int countFiles = 0;
    static long totalValue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();

        Path path = Paths.get(line);

        if (Files.isDirectory(path)) {

            Files.walkFileTree(path, new MyFileVisitor());

            System.out.printf("Всего папок - %d\n", countDirectory);
            System.out.printf("Всего файлов - %d\n", countFiles);
            System.out.printf("Общий размер - %d", totalValue);
        } else System.out.printf("%s - не папка", line);

    }

    static class MyFileVisitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            countDirectory++;
            return super.preVisitDirectory(dir, attrs);
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            countFiles++;
            totalValue += Files.size(file);
            return super.visitFile(file, attrs);
        }
    }
}
