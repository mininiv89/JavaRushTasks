package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()) {
                String[] words = reader.readLine().split(" ");

                int year = Integer.parseInt(words[words.length-1]);
                int month = Integer.parseInt(words[words.length-2]);
                int day = Integer.parseInt(words[words.length-3]);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
                Date date = simpleDateFormat.parse(day + " " + month + " " + year);

                StringBuilder string = new StringBuilder();
                for (int i = 0; i < words.length-3; i++) {
                    string.append(words[i]+ " ");
                }
                string.delete(string.length()-1, string.length());

                PEOPLE.add(new Person(string.toString(), date));
            }
        } catch (Exception ignore) {}

        for (Person person : PEOPLE) {
            System.out.println(person.getName()+ " " + person.getBirthday());
        }
    }
}
