package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static Date replaceBirthDay(String date) {
        int year; int month ; int day;
        String[] arrDate = date.split("/");

        year = Integer.parseInt(arrDate[2])-1900;
        month  = Integer.parseInt(arrDate[1])-1;
        day = Integer.parseInt(arrDate[0]);

        return new Date(year, month , day);
    }

    private static boolean sex(String sex) {
        return sex.equals("м") ? true : false;
    }

    private static void info(int id) {
        Person person = allPeople.get(id);
        String name = person.getName();
        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
        SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        System.out.println(String.format("%s %s %s" ,name , sex, date.format(person.getBirthDay())));
    }

    public static void main(String[] args) {
        int id; String name; boolean sex;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = allPeople.size();
                        name = args[i++];
                        sex = sex(args[i++]);
                        Date birthDay = replaceBirthDay(args[i]);

                        allPeople.add(sex ? Person.createMale(name, birthDay) : Person.createFemale(name, birthDay));

                        System.out.println(id);
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i++]);
                        name = args[i++];
                        sex = sex(args[i++]);

                        Date birthDay = replaceBirthDay(args[i]);

                        allPeople.get(id).setName(name);
                        allPeople.get(id).setSex(sex ? Sex.MALE : Sex.FEMALE);
                        allPeople.get(id).setBirthDay(birthDay);
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        try {
                            Person person = allPeople.get(id);

                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDay(null);

                            System.out.println(String.format("Человек под id=%d - удален", id));
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(String.format("Человек под id=%d - не найден", id));
                        }
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        info(id);
                    }
                    break;
                }
            default:
                synchronized (allPeople) {
                    System.out.println("Команда не найдена!");
                    break;
                }
        }
    }
}
