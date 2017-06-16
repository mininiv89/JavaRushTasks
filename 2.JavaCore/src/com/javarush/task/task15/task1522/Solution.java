package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet = reader.readLine();
        if (Planet.SUN.equals(planet)) thePlanet = Sun.getInstance();
        else if (Planet.EARTH.equals(planet)) thePlanet = Earth.getInstance();
        else if (Planet.MOON.equals(planet)) thePlanet = Moon.getInstance();
        else thePlanet = null;
    }
}
