package com.javarush.task.task23.task2303;

/* 
Запрети создание экземпляров класса
*/
public class Solution {

    public abstract static class Listener {
        public void onMouseDown(int x, int y) {
            //do sometfhing on mouse down event
        }

        public void onMouseUp(int x, int y) {
            //do something on mouse up event
        }

        private Listener() {
        }
    }

    public static void main(String[] args) {
    }
}
