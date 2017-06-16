package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        File file = new File(fileName);

        Properties properties = new Properties();

        if (file.isDirectory()) return properties;

        try (FileInputStream fileInputStream = new FileInputStream(file.getAbsoluteFile())) {

            if (fileName.matches("^.*\\.xml$")) properties.loadFromXML(fileInputStream);
            else if (fileName.matches("^.*\\.[^.]*")) properties.load(fileInputStream);
            else properties.load(fileInputStream);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return properties;
        }

    }
}
