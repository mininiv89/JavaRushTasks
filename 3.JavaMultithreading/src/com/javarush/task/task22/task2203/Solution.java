package com.javarush.task.task22.task2203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();

        Pattern p = Pattern.compile("^[^\\t]*(\\t)[^\\t]*(\\t).*");
        Matcher m = p.matcher(string);

        if (m.matches()) return string.substring(m.end(1), m.start(2));
        else throw new TooShortStringException();
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис обучения Java."));
    }
}
