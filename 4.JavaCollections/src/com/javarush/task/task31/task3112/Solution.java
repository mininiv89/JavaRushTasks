package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://opensource.apple.com/source/vim/vim-6/vim/runtime/doc/filetype.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        Path tempFile = Files.createTempFile("temp-", ".tmp");
        Files.copy(in, tempFile);
        String fileName = urlString.substring(urlString.lastIndexOf("/"));
        Path result = Paths.get(downloadDirectory.toString() + fileName);
        return Files.move(tempFile, result);
    }
}
