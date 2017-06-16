package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);
        FileOutputStream on = new FileOutputStream(args[1]);
        byte[] w1251 = new byte[in.available()];

        in.read(w1251);

        String buffer = new String(w1251, "UTF-8");
        on.write(buffer.getBytes("Windows-1251"));
        in.close();
        on.close();

//        byte[] buffer = win1251TestString.getBytes("Windows-1251");
//        System.out.println(new String(buffer, "UTF-8"));
    }
}

