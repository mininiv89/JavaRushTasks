package com.javarush.task.task31.task3105;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String pathZip = args[1];
        String pathFile = args[0];



        try (FileOutputStream zipFileSave = new FileOutputStream(pathZip);
             FileInputStream zipFileLoad = new FileInputStream(pathZip);
             ZipOutputStream zipSave = new ZipOutputStream(zipFileSave);
             ZipInputStream zipLoad = new ZipInputStream(zipFileLoad)){

        }






    }
}
