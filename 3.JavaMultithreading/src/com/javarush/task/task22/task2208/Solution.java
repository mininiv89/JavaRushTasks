package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>() {};
        map.put("first", "Mama");
        map.put("second", "Mila");

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder string = new StringBuilder();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            string = key != null && value != null ? string.append(key + " = '" + value + "' and ") : string;
        }
        string.delete(string.lastIndexOf("'")+1,string.lastIndexOf(" ")+1);

        return string.toString();
    }
}
