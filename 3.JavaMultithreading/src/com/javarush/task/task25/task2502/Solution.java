package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws IllegalArgumentException {
            //init wheels here
            wheels = new ArrayList<>();
            if (loadWheelNamesFromDB().length != 4) throw new IllegalArgumentException();

            for (String string : loadWheelNamesFromDB()) {
                if (Wheel.valueOf(string).toString().equals(string)) wheels.add(Wheel.valueOf(string));
                else throw new IllegalArgumentException();
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT111"};
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        for (Wheel wheel : new Car().wheels) {
            System.out.println(wheel);
        }
    }
}
