package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Запрет сериализации
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        public void writeObject(ObjectOutputStream outputStream) throws NotSerializableException {
            throw new NotSerializableException();
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }

    }

    public static void main(String[] args) {

    }
}
